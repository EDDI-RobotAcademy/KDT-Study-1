<template lang="">
  <div>
    <h2>읽기</h2>
    <board-read-form v-if="board" :board="board" />
    <p v-else>로딩중 .......</p>
    <router-link :to="{ name: 'BoardListPage' }"> 돌아가기 </router-link>
  </div>
</template>

<script>
import ProductReadForm from "@/components/board/ProductReadForm.vue";
import { mapActions, mapState } from "vuex";
const boardModule = "boardModule";
export default {
  components: { ProductReadForm },
  props: {
    boardId: {
      type: String,
      required: true,
    },
  },
  computed: {
    ...mapState(boardModule, ["board"]),
  },
  methods: {
    ...mapActions(boardModule, ["requestProductToSpring"]),
  },
  created() {
    this.requestProductToSpring(this.boardId);
  },
};
</script>

<style lang=""></style>
