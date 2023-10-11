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
    <div class="outside-wrapper">
      <p>Land map</p>
      <!--      <div class="outside-wrapper">-->
      <div class="inside-wrapper">
        <img :src="imageSrc" alt="No connection" class="image">
        <canvas-component/>
      </div>
      <!--      </div>-->
    </div>
    <div>
      <default-button @click="decrease">Decrease</default-button>
      <default-button @click="increase">Increase</default-button>
    </div>
    <div>
      <p class="paint-text">Paint required area of land (current land may not match the view on the map)</p>
      <default-button @click="startPainting">Paint</default-button>
      <default-button @click="clearArea">Clear</default-button>
    </div>
  </div>
  <div class="parameters">
    <default-input placeholder="Name"/>
    <default-input placeholder="Parameter to measure"/>
    <default-button @click="chooseData">Choose measurement data</default-button>
  </div>
  <div class="footer">
    <default-button @click="closeModal">Cancel</default-button>
    <button @click="confirm">Confirm</button>
  </div>
</template>

<script>
import {yandexMap, ymapMarker} from "vue-yandex-maps";
import DefaultButton from "@/components/UI/DefaultButton";
import DefaultInput from "@/components/UI/DefaultInput";
import CanvasComponent from "@/components/CanvasComponent";

export default {
  name: "field-registration-form",
  components: {CanvasComponent, DefaultInput, DefaultButton, yandexMap, ymapMarker},
  data() {
    return {
      coords: [52.477137, 24.738898],
      online: navigator.onLine,
      imageSrc: 'https://static-maps.yandex.ru/1.x/?ll=23.282781,52.378432&z=14&l=sat&size=450,450',
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

.image {
  position: absolute;
  top: 0;
  left: 0;
}

.inside-wrapper {
  width: 100%;
  height: 100%;
  position: relative;
}

/*.outside-wrapper {*/
/*  width:125px;*/
/*  height:125px;*/
/*  margin:20px 60px;*/
/*  border:1px solid blue;*/
/*}*/
</style>