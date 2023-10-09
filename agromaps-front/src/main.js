import { createApp } from 'vue';
import App from './App.vue';
import YmapPlugin from 'vue-yandex-maps'
// import components from '@/components/UI';

// components.forEach(component => {
//     app.component(component.name, component)
// })

const settings = {
    apiKey: "41a08ed6-39f7-4a60-b650-b273b1059539",
    lang: 'ru_RU',
    coordorder: 'latlong',
    version: '2.1'
}

const app = createApp(App)

app.use(YmapPlugin, settings)
app.mount('#app')