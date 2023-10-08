<template>
  <div class="header">
    <div>
      <p>Land map</p>
      <img src="https://static-maps.yandex.ru/1.x/?ll=23.282781,52.378432&z=14&l=sat&size=450,450" alt="No connection">
    </div>
    <div>
      <button @click="decrease" class="decrease-button">Decrease</button>
      <button @click="increase" class="increase-button">Increase</button>
    </div>
    <div>
      <p>Paint required area of land (current land may not match the view on the map)</p>
      <button @click="startPainting">Paint</button>
      <button @click="clearArea">Clear</button>
    </div>
  </div>
  <div class="parameters">
    <input type="text" placeholder="Name">
    <input type="text" placeholder="Parameter to measure">
    <button @click="chooseData" class="button">Choose measurement data</button>
  </div>
  <div class="footer">
    <button @click="closeModal" class="button">Cancel</button>
    <button @click="confirm" class="button">Confirm</button>
  </div>
</template>

<script>
export default {
  name: "field-registration-form",
  methods: {
    confirm() {
      //todo
      this.closeModal();
    },
    chooseData() {
      //todo
    },
    increase() {
      //todo
    },
    decrease() {
      //todo
    },
    clearArea() {
      //todo
    },
    startPainting() {
      //todo
    },
    closeModal() {
      //todo
    }
  }
}

</script>

<style scoped>

</style>