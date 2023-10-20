<template>
  <div>
    <h3>List of fields</h3>
    <field-item v-for="field in fieldResponse.fields" :key="field.id" :field="field"/>
  </div>
</template>

<script>
import FieldService from "@/services/FieldService";
import FieldItem from "@/components/FieldItem";

export default {
  name: "field-list",
  components: {FieldItem},
  data() {
    return {
      fieldResponse: [],
    }
  },
  methods: {
    getFields() {
      FieldService.getFields().then((response) => {
        this.fieldResponse = response.data;
      });
    },
  },
  created() {
    this.getFields();
  }
}
</script>

<style scoped>

</style>