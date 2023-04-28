import {
  REQUEST_PRODUCT_LIST_TO_SPRING,
  REQUEST_PRODUCT_TO_SPRING,
} from "./mutation-types";

export default {
  [REQUEST_PRODUCT_LIST_TO_SPRING](states, receivedData) {
    states.products = receivedData;
  },
  [REQUEST_PRODUCT_TO_SPRING](states, receivedData) {
    states.product = receivedData;
  },
};
