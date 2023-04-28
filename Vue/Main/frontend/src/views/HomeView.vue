<template lang="">
  <div>
    <h2>상품 게시판</h2>
    <board-list-form :boards="boards" />
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
