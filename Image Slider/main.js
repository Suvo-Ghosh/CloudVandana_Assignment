const images = [
    'https://fastly.picsum.photos/id/990/600/400.jpg?hmac=0ThrDbALCAdiTjfViw4m0glP6ZlLp-pofK3Mx5ydEqU',
    'https://tse2.mm.bing.net/th?id=OIP.9Ut0kSOlIJ78mfa9oRyNFwHaE8&pid=Api&P=0&h=180',
    'https://tse2.mm.bing.net/th?id=OIP.FdvxkzJ8lN-FLuRKRUKjhgHaE8&pid=Api&P=0&h=180'
];

const slider = document.getElementById('slider');

images.forEach((imgSrc, index) => {
    const img = document.createElement('img');
    img.src = imgSrc;
    img.classList.add(index === 0 ? 'active' : 'hidden');
    slider.appendChild(img);
});

let currentIndex = 0;

function showImage(index) {
    const imgs = document.querySelectorAll('#slider img');
    imgs.forEach(img => img.classList.remove('active'));
    imgs[index].classList.add('active');
}

document.getElementById('nextBtn').addEventListener('click', () => {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
});

document.getElementById('prevBtn').addEventListener('click', () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
}); 