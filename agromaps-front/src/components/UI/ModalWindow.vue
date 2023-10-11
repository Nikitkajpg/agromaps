<template>
  <div v-if="show" @click.stop="closeModal" class="modal-shadow">
    <div @click.stop class="modal">
      <slot/>
    </div>
  </div>
</template>

<script>
export default {
  name: "modal-window",
  props: {
    show: {
      type: Boolean,
      default: false,
    }
  },
  methods: {
    closeModal() {
      this.$emit('update:show', false);
    },
  },
}
</script>

<style scoped>
.modal-shadow {
  position: absolute;
  top: 0;
  left: 0;
  min-height: 100%;
  width: 100%;
  background: rgba(0, 0, 0, 0.39);
}

.modal {
  position: absolute;
  top: 25%;
  left: 25%;
  background: #fff;
}
</style>