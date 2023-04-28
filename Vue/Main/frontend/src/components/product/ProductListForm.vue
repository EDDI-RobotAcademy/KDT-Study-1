<template lang="">
  <div>
    <h3>상품 목록</h3>
    <table>
      <tr>
        <th align="center" width="20%">상품명</th>
        <th align="center" width="20%">제조사</th>
        <th align="center" width="20%">카테고리</th>
        <th align="center" width="40%">유통기한</th>
      </tr>
      <tr v-if="!products || (Array.isArray(products) && products.length === 0)">
        <td colspan="4">등록된 상품이 없습니다</td>
      </tr>
      <tr v-else v-for="(product, index) in products" :key="index">
        <td align="center">
          <router-link
            :to="{
              name: 'ProductReadPage',
              params: { productId: product.productId.toString() },
            }"
          >
            {{ product.name }}
          </router-link>
        </td>
        <td align="center">
          {{ product.manufacturer }}
        </td>
        <td align="center">
          {{ product.category }}
        </td>
        <td align="center">
          {{ product.expireDate }}
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  props: {
    product: {
      type: Array,
    },
  },
};
</script>

<style lang=""></style>
