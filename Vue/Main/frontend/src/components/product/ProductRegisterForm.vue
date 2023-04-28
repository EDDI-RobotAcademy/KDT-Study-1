ProductRegisterForm.vue
<template lang="">
  <div>
    <form @submit.prevent="onSubmit">
      <table>
        <tr>
          <td>상품명</td>
          <td>
            <input type="text" v-model="name" />
          </td>
        </tr>

        <tr>
          <td>가격</td>
          <td>
            <input type="text" v-model="detail" />
          </td>
        </tr>

        <tr>
          <td>제조사</td>
          <td>
            <input type="text" v-model="manufacturer" />
          </td>
        </tr>

        <tr>
          <td>유통기한</td>
          <td>
            <input type="text" v-model="expireDate" />
          </td>
        </tr>

        <tr>
          <td>카테고리</td>
          <td>
            <input type="text" v-model="category" />
          </td>
        </tr>

        <div>
          <button type="text">등록</button>
          <button>취소임시버튼</button>
          <!-- <router-link :to="{ name: '리스트페이지로수정' }">
                      취소
              </router-link> -->
        </div>
      </table>
    </form>
  </div>
</template>

<script>
export default {
  name: "ProductRegisterForm",
  data() {
    return {
      name: "상품명",
      detail: "상세정보",
      manufacturer: "제조사",
      expireDate: "유통기한",
      category: "카테고리",
    };
  },
  methods: {
    onSubmit() {
      const { name, detail, manufacturer, expireDate, category } = this;
      this.$emit("submit", {
        name,
        detail,
        manufacturer,
        expireDate,
        category,
      });
    },
  },
};
</script>

<style lang=""></style>
