<template>
  <div class="item">
    <div>Name: {{field.name}}</div>
    <div>
      <img :src="image" alt="No connection" class="img">
    </div>
  </div>
</template>

<script>
export default {
  name: "field-item",
  props: {
    field: {
      type: Object,
      required: true,
    }
  },
  data() {
    return {
      image: this.field.address
    }
  }
}
</script>

<style scoped>
.img {
  width: 100px;
  height: 100px;
}
</style>