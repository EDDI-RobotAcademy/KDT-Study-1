import { REQUEST_PRODUCT_LIST_TO_SPRING } from "./mutation-types";
import { REQUEST_PRODUCT_TO_SPRING } from "./mutation-types";

import axiosInst from "@/utility/axiosInst";

export default {
  requestProductListToSpring({ commit }) {
    return axiosInst.get("/list").then((res) => {
      commit(REQUEST_PRODUCT_LIST_TO_SPRING, res.data);
    });
  },
  requestProductToSpring({ commit }, productId) {
    return axiosInst.get(`product-problem/${productId}`).then((res) => {
      commit(REQUEST_PRODUCT_TO_SPRING, res.data);
    });
  },
  requestDeleteProductToSpring({}, productId) {
    return axiosInst
      .delete(`product-problem/${productId}`)
      .then((res) => {
        alert("삭제 성공!");
      })
      .catch(() => {
        alert("삭제 실패!");
      });
  },
  requestCreateProductToSpring({}, payload) {
    const { product, price, manufacturer, ex_date } = payload;

    return axiosInst
      .post("/register", { product, price, manufacturer, ex_date })
      .then((res) => {
        alert("상품 등록 성공!");
        return res;
      })
      .catch(() => {
        alert("문제 발생!");
      });
  },
};
