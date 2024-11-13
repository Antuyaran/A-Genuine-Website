document.addEventListener("DOMContentLoaded", function() {
    const ad = document.getElementById("bouncingAd");
    let posX = 0; // 初始的水平位置
    let posY = window.innerHeight - ad.offsetHeight; // 初始的垂直位置
    let velocityX = 2; // 水平方向速度
    let velocityY = -2; // 垂直方向速度（负数表示向上移动）

    function moveAd() {
        // 更新广告的位置
        posX += velocityX;
        posY += velocityY;

        // 如果广告触碰到右边界或者左边界，反向水平速度
        if (posX + ad.offsetWidth >= window.innerWidth || posX <= 0) {
            velocityX = -velocityX;
        }

        // 如果广告触碰到顶部边界或者底部边界，反向垂直速度
        if (posY + ad.offsetHeight >= window.innerHeight || posY <= 0) {
            velocityY = -velocityY;
        }

        // 设置广告的新位置
        ad.style.left = posX + "px";
        ad.style.top = posY + "px";

        // 继续下一帧动画
        requestAnimationFrame(moveAd);
    }

    // 开始动画
    moveAd();
});