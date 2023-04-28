<template lang="">
  <div>
    <h2>상품 수정</h2>
    <board-modify-form v-if="product" :product="product" @submit="onSubmit" />
    <p v-else>로딩중 .......</p>
  </div>
</template>

<script>
import BoardModifyForm from "@/components/product/ProductModifyForm.vue";
import { mapActions, mapState } from "vuex";
const productModule = "productModule";
export default {
  components: {
    ProductModifyForm,
  },
  props: {
    productId: {
      type: String,
      required: true,
    },
  },
  computed: {
    ...mapState(productModule, ["product"]),
  },
  methods: {
    ...mapActions(boardModule, [
      "requestBoardToSpring",
      "requestBoardModifyToSpring",
    ]),
    async onSubmit(payload) {
      const { title, content, writer } = payload;
      const boardId = this.boardId;
      await this.requestBoardModifyToSpring({
        title,
        content,
        writer,
        boardId,
      });
      await this.$router.push({
        name: "BoardReadPage",
        params: { boardId: this.boardId },
      });
    },
  },
  created() {
    this.requestBoardToSpring(this.boardId);
  },
};
</script>

<style lang=""></style>
