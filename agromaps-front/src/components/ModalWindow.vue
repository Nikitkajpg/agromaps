<template>
  <div v-if="show" @click.self="closeModal" class="modal-shadow">
    <div class="modal">
      <slot/>
    </div>
  </div>
</template>

<script>
export default {
  name: "modal-window",
  data() {
    return {
      show: false,
    }
  },
  methods: {
    closeModal() {
      this.show = false;
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