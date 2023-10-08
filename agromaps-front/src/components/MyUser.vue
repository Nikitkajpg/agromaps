<template>
  <div class="container">
    <h1 class="text-center">User list</h1>

    <table class="table">
      <tr>
        <th>Id</th>
        <th>Username</th>
        <th>User email</th>
        <th>User password</th>
      </tr>
      <tr v-for="users in users_resp.users" v-bind:key="users.id">
        <td>{{ users.id }}</td>
        <td>{{ users.username }}</td>
        <td>{{ users.email }}</td>
        <td>{{ users.password }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
import UserService from "@/services/UserService";

export default {
  name: 'my-user',
  data() {
    return {
      users_resp: []
    }
  },
  methods: {
    getUsers() {
      UserService.getUsers().then((response) => {
        this.users_resp = response.data;
        console.log(response.data)
      });
    },
  },
  created() {
    this.getUsers();
  }
}
</script>

<style scoped>

</style>