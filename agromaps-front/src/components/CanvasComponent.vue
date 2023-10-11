<template>
  <canvas class="canvas" id="canvas" @mousemove="draw" @mousedown="beginDrawing" @mouseup="stopDrawing"/>
</template>

<script>
export default {
  name: "canvas-component",
  data() {
    return {
      canvas: null,
      x: 0,
      y: 0,
      isDrawing: false,
    }
  },
  mounted() {
    // const canvas = this.$refs.canvas;
    // const ctx = canvas.getContext("2d");
    const c = document.getElementById('canvas');
    c.width = 450;
    c.height = 450;
    this.canvas = c.getContext('2d');
  },
  methods: {
    drawCircle(x, y) {
      let ctx = this.canvas;
      ctx.beginPath();
      ctx.arc(x, y, 15, 0, Math.PI * 2);
      ctx.fillStyle = 'orange';
      ctx.fill();
    },
    drawLine(x1, y1, x2, y2) {
      let ctx = this.canvas;
      ctx.beginPath();
      ctx.strokeStyle = 'orange';
      ctx.lineWidth = 30;
      ctx.moveTo(x1, y1);
      ctx.lineTo(x2, y2);
      ctx.stroke();
      ctx.closePath();
    },
    draw(e) {
      if (this.isDrawing) {
        this.drawLine(this.x, this.y, e.offsetX, e.offsetY);
        this.drawCircle(this.x, this.y);
        this.x = e.offsetX;
        this.y = e.offsetY;
      }
    },
    beginDrawing(e) {
      this.x = e.offsetX;
      this.y = e.offsetY;
      this.isDrawing = true;
    },
    stopDrawing(e) {
      if (this.isDrawing) {
        this.drawLine(this.x, this.y, e.offsetX, e.offsetY);
        this.drawCircle(this.x, this.y);
        this.x = e.offsetX;
        this.y = e.offsetY;
        this.isDrawing = false;
      }
    }
  }
}
</script>

<style scoped>
.canvas {
  position: absolute;
  top: 0;
  left: 0;
}
</style>