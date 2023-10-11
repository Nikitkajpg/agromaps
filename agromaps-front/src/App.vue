<template>
  <div id="app">
    <my-user/>
    <button @click="showModal" class="show-modal-button">Register land</button>
    <modal-window v-model:show="windowVisible">
      <field-registration-form @create="createField"/>
    </modal-window>
  </div>
</template>

<script>
import MyUser from "@/components/MyUser";
import ModalWindow from "@/components/UI/ModalWindow";
import FieldRegistrationForm from "@/components/FieldRegistrationForm";

export default {
  components: {
    FieldRegistrationForm,
    ModalWindow,
    MyUser,
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

</style>
