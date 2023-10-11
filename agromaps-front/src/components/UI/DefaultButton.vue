<template>
  <button class="button">
    <slot></slot>
  </button>
</template>

<script>
export default {
  name: "default-button"
}
</script>

<style scoped>
.button {
  padding: 10px 10px;
  background: none;
  color: indigo;
  border: 1px solid indigo;
}
</style>