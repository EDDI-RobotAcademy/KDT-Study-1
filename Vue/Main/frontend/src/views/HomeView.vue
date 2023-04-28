<template lang="">
  <div>
    <h2>상품 게시판</h2>
    <<<<<<< HEAD

    <board-list-form :products="products" />
    =======
    <board-list-form :boards="boards" />
    >>>>>>> 59bc67e43fd66e439019a5b9d4246f1f046c1679
  </div>
</template>

<script>
import { mapActions, mapState } from "vuex";

import BoardListForm from "@/components/board/BoardListForm.vue";
const boardModule = "boardModule";
export default {
  components: { BoardListForm },

  computed: {
    ...mapState(boardModule, ["boards"]),
  },
  mounted() {
    this.requestBoardListToSpring();
  },
  methods: {
    ...mapActions(boardModule, ["requestBoardListToSpring"]),
  },
};
</script>

<style lang=""></style>
