<template>
  <div class="header">
    <div>
      <p>Select a map section and click on its intended center</p>
      <div v-if="online">
        <yandex-map ymap-class="map"
                    zoom="15"
                    :coords="coords"
                    map-type="hybrid"
                    @click.self="onClick"
                    :controls="['zoomControl', 'geolocationControl', 'searchControl']"
                    :options="{ suppressMapOpenBlock: true }"
                    alt="no"
        >
          <ymap-marker
              :coords="coords"
              marker-id="123"
              :balloon-template="balloonTemplate"
          ></ymap-marker>
        </yandex-map>
      </div>
      <div v-else>
        <p>No connection</p>
      </div>
    </div>
    <div>
      <p>Land map</p>
      <img src="https://static-maps.yandex.ru/1.x/?ll=23.282781,52.378432&z=14&l=sat&size=450,450" alt="No connection">
    </div>
    <div>
      <button @click="decrease" class="decrease-button">Decrease</button>
      <button @click="increase" class="increase-button">Increase</button>
    </div>
    <div>
      <p class="paint-text">Paint required area of land (current land may not match the view on the map)</p>
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
import {yandexMap, ymapMarker} from "vue-yandex-maps";

export default {
  name: "field-registration-form",
  components: {yandexMap, ymapMarker},
  data() {
    return {
      coords: [52.477137, 24.738898],
      online: navigator.onLine,
    };
  },
  computed: {
    balloonTemplate() {
      return `<p>${this.coords}</p>`
    }
  },
  watch: {
    online(v) {
      if (v) {
        this.onLine = navigator.onLine;
      } else {
        this.online = navigator.onLine;
      }
    }
  },
  methods: {
    onClick(event) {
      this.coords = event.get('coords');
    },
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

<style>
.header {
  display: flex;
}

.map {
  width: 600px;
  height: 600px;
}

.paint-text {
  width: 200px;
}
</style>