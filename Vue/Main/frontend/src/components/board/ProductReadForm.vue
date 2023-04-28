<template lang="">
  <div>
    <table>
      <tr>
        <td>상품번호</td>
        <td>
          <input type="text" :value="board.productId" readonly />
        </td>
      </tr>
      <tr>
        <td>상품명</td>
        <td>
          <input type="text" :value="board.name" readonly />
        </td>
      </tr>
      <tr>
        <td>가격</td>
        <td>
          <input type="text" :value="board.price" readonly />
        </td>
      </tr>
      <tr>
        <td>제조사</td>
        <td>
          <input type="text" :value="board.brand" readonly />
        </td>
      </tr>
      <tr>
        <td>제조일자</td>
        <td>
          <input type="text" :value="board.manufacturer" readonly />
        </td>
      </tr>
      <tr>
        <td>유통기한</td>
        <td>
          <input type="text" :value="board.expireDate" readonly />
        </td>
      </tr>
      <tr>
        <td>카테고리</td>
        <td>
          <input type="text" :value="board.category" readonly />
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "ProductReadForm",
  props: {
    board: {
      type: Object,
      required: true,
    },
  },
};
</script>

<style lang=""></style>
