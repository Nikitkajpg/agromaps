import { createApp } from 'vue';
import App from './App.vue';
// import components from '@/components/UI';

// components.forEach(component => {
//     app.component(component.name, component)
// })

const app = createApp(App)

app.mount('#app')