<template>
  <div id="app">
    <field-list/>
    <button @click="showModal" class="show-modal-button">Register land</button>
    <modal-window v-model:show="windowVisible">
      <field-registration-form @create="createField"/>
    </modal-window>
  </div>
</template>

<script>
import ModalWindow from "@/components/UI/ModalWindow";
import FieldRegistrationForm from "@/components/FieldRegistrationForm";
import FieldList from "@/components/FieldList";

export default {
  components: {
    FieldList,
    FieldRegistrationForm,
    ModalWindow,
  },
  data() {
    return {
      windowVisible: false,
    }
  },
  methods: {
    createField() {
      this.windowVisible = false;
    },
    showModal() {
      this.windowVisible = true;
    },
  }
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
</style>
