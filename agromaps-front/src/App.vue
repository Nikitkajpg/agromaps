<template>
  <div id="app">
    <my-user/>
    <button @click="showModal" class="show-modal-button">Register land</button>
    <modal-window ref="modal">
      <field-registration-form/>
    </modal-window>
  </div>
</template>

<script>
import MyUser from "@/components/MyUser";
import ModalWindow from "@/components/ModalWindow";
import FieldRegistrationForm from "@/components/FieldRegistrationForm";

export default {
  components: {
    FieldRegistrationForm,
    ModalWindow,
    MyUser,
  },
  data() {
    return {
      dialogVisible: false,
    }
  },
  methods: {
    showModal() {
      this.$refs.modal.show = true;
    },
  }
}
</script>

<style>

</style>
