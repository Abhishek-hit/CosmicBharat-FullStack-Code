// 1. Sticky Navbar Effect
window.addEventListener('scroll', function () {
    const navbar = document.getElementById('navbar');
    if (window.scrollY > 50) {
        navbar.classList.add('scrolled');
    } else {
        navbar.classList.remove('scrolled');
    }
});

// 2. Mobile Menu Toggle
function toggleMenu() {
    const navMenu = document.getElementById('navMenu');
    const hamburger = document.querySelector('.hamburger i');

    navMenu.classList.toggle('active');

    // Toggle Icon between Bars and X
    if (navMenu.classList.contains('active')) {
        hamburger.classList.remove('fa-bars');
        hamburger.classList.add('fa-xmark');
    } else {
        hamburger.classList.remove('fa-xmark');
        hamburger.classList.add('fa-bars');
    }
}

// 3. Mobile Dropdown Toggle
const navItems = document.querySelectorAll('.nav-item');
navItems.forEach(item => {
    item.addEventListener('click', function () {
        // Only on mobile
        if (window.innerWidth <= 1024) {
            // Close others
            navItems.forEach(otherItem => {
                if (otherItem !== item) otherItem.classList.remove('mobile-open');
            });
            // Toggle current
            this.classList.toggle('mobile-open');
        }
    });
});


// jhkjd

// Counter Animation (Same as before)
const counters = document.querySelectorAll('.counter');
const speed = 200;

const animateCounters = () => {
    counters.forEach(counter => {
        const updateCount = () => {
            const target = +counter.getAttribute('data-target');
            const count = +counter.innerText.replace('+', '');
            const inc = target / speed;

            if (count < target) {
                counter.innerText = Math.ceil(count + inc) + (target === 5000 ? '+' : '');
                setTimeout(updateCount, 20);
            } else {
                counter.innerText = target + (target === 5000 ? '+' : '');
            }
        };
        updateCount();
    });
};

let observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            animateCounters();
            observer.unobserve(entry.target);
        }
    });
}, { threshold: 0.5 });

document.querySelectorAll('.trinity-grid').forEach(section => {
    observer.observe(section);
});

// fact ke liye java script
const cosmicSection = document.getElementById('cosmic-wrapper');
    
    if(cosmicSection) {
        // Animation Logic
        const observer = new IntersectionObserver((entries) => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    entry.target.classList.add('visible');
                }
            });
        }, { threshold: 0.1 });

        // Sirf wrapper ke andar wale fact-rows dhundega
        cosmicSection.querySelectorAll('.fact-row').forEach(row => {
            observer.observe(row);
        });
    }