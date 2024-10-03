package com.example.productlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.productlist.model.Product;
import com.example.tan01.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Product> products = new ArrayList<>();


        Product product = new Product();
        product.setProduct_name("iPhone 16 Pro Max ");
        product.setProduct_image("https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/iphone-card-40-iphone16prohero-202409?wid=680&hei=528&fmt=p-jpg&qlt=95&.v=1725567335931");
        product.setProduct_price(48900);
        product.setProduct_description("- หน้าจอ Super Retina XDR OLED 6.9 นิ้ว 2868 x 1320 พิกเซล ProMotion 120Hz\n" +
                "          - ชิปประมวลผล A18 Pro\n" +
                "          - ความจุ 256GB/512GB/1TB\n" +
                "          - กล้องหลัง 3 เลนส์ Fusion Main 48MP f/1.78 + Ultrawide 48MP f/2.2 + Telephoto 5x 12MP f/2.8, Optical Zoom 5x, Digital Zoom 25x\n" +
                "          - กล้อง TrueDepth 12MP f/1.9\n" +
                "          - ปุ่ม Action และ Camera Control ด้านข้างเครื่อง\n" +
                "          - รองรับ 5G, Wi‑Fi 7, Bluetooth 5.3, NFC\n" +
                "          - กันน้ำ IP68\n" +
                "          - พอร์ต USB-C (USB 3)\n" +
                "          - แบตเตอรี่การเล่นวิดีโอสูงสุด 33 ชม., เล่นวิดีโอ (สตรีม) สูงสุด 29 ชม., เล่นเสียงสูงสุด 105 ชม.\n" +
                "          - ชาร์จได้ 50% ใน 30 นาที ด้วยอะแดปเตอร์ 20W หรือสูงกว่า (ต้องซื้อแยก)\n" +
                "          - ชาร์จไร้สาย MagSafe 25W, ชาร์จไร้สาย Qi2 15W\n" +
                "          - ระบบปฏิบัติการ iOS 18\n" +
                "          - ขนาดตัวเครื่อง 77.6 x 163 x 8.25 มม. น้ำหนัก 227 กรัม");
        products.add(product);


        Product product6 = new Product();
        product6.setProduct_name("iPhone 16");
        product6.setProduct_image("https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/iphone-card-40-iphone16hero-202409?wid=680&hei=528&fmt=p-jpg&qlt=95&.v=1723234230295");
        product6.setProduct_price(29900);
        product6.setProduct_description("- หน้าจอ Super Retina XDR OLED 6.1 นิ้ว 2556 x 1179 พิกเซล\n" +
                "          - ชิปประมวลผล A18\n" +
                "          - ความจุ 128GB/256GB/512GB\n" +
                "          - กล้องหลังคู่ Fusion Main 48MP f/1.6 + Ultrawide 12MP f/2.2\n" +
                "          - กล้องหน้า TrueDepth 12MP f/1.9\n" +
                "          - ปุ่ม Action และ Camera Control ด้านข้างเครื่อง\n" +
                "          - รองรับ 5G, Wi‑Fi 7, Bluetooth 5.3, NFC\n" +
                "          - กันน้ำ IP68\n" +
                "          - พอร์ต USB-C (USB 2)\n" +
                "          - แบตเตอรี่การเล่นวิดีโอสูงสุด 22 ชม., เล่นวิดีโอ (สตรีม) สูงสุด 18 ชม., เล่นเสียงสูงสุด 80 ชม.\n" +
                "          - ชาร์จได้ 50% ใน 30 นาที ด้วยอะแดปเตอร์ 20W หรือสูงกว่า (ต้องซื้อแยก)\n" +
                "          - ชาร์จไร้สาย MagSafe 25W, ชาร์จไร้สาย Qi2 15W\n" +
                "          - ระบบปฏิบัติการ iOS 18\n" +
                "          - ขนาดตัวเครื่อง 71.6 x 147.6 x 7.8 มม. น้ำหนัก 170 กรัม");
        products.add(product6);

        Product product3 = new Product();
        product3.setProduct_name("Galaxy S24 Ultra");
        product3.setProduct_image("https://images.samsung.com/is/image/samsung/p6pim/th/2401/gallery/th-galaxy-s24-s928-sm-s928bztcthl-thumb-539305623?$216_216_PNG$");
        product3.setProduct_price(42900);
        product3.setProduct_description("- หน้าจอ Dynamic AMOLED 2X 6.2 นิ้ว FHD+ 120Hz\n" +
                "          - ชิปประมวลผล Exynos 2400\n" +
                "          - แรม 8GB\n" +
                "          - ความจุ 256GB/512GB\n" +
                "          - กล้องหลัง 3 เลนส์ Main 50MP F1.8 OIS+Telephoto 10MP F2.4 Optical Zoom 3x, Digital Zoom 30x+Ultrawide 12MP F2.2\n" +
                "          - กล้องหน้า 12MP F2.2\n" +
                "          - เซ็นเซอร์สแกนลายนิ้วมือบนหน้าจอ\n" +
                "          - กันน้ำกันฝุ่น IP68\n" +
                "          - รองรับ 5G, Wi-Fi 6, Bluetooth 5.3, NFC\n" +
                "          - แบตเตอรี่ 4000mAh รองรับชาร์จเร็ว 25W\n" +
                "          - ระบบปฏิบัติการ Android 14 (One UI 6.1)\n" +
                "          - ขนาดตัวเครื่อง 147.0 x 70.6 x 7.6 มม. น้ำหนัก 167 กรัม");
        products.add(product3);

        Product product4 = new Product();
        product4.setProduct_name("Galaxy Z Flip6 (Online Exclusive)");
        product4.setProduct_image("https://images.samsung.com/is/image/samsung/p6pim/th/sm-f741bzwathl/gallery/th-galaxy-zflip6-f741-sm-f741bzwathl-thumb-542632329?$216_216_PNG$");
        product4.setProduct_price(42900);
        product4.setProduct_description("- หน้าจอหลักด้านใน Dynamic AMOLED 2X 7.6 นิ้ว (2160 x 1856) 120Hz\n" +
                "          - หน้าจอด้านนอก Dynamic AMOLED 2X 6.3 นิ้ว (968 x 2376)\n" +
                "          - ชิปประมวลผล Snapdragon 8 Gen 3\n" +
                "          - แรม 12GB\n" +
                "          - ความจุ 256GB/512GB/1TB\n" +
                "          - กล้องหลัง 3 เลนส์ 50MP + 12MP + 10MP Optical Zoom 3x, Digital Zoom 30x\n" +
                "          - กล้องหน้าบนจอนอก 10MP / กล้องหน้าบนจอหลัก 4MP\n" +
                "          - รองรับ 5G, Wi-Fi 6, Bluetooth 5.3, NFC\n" +
                "          - กันน้ำ IPX8\n" +
                "          - ใช้ร่วมกับปากกา S Pen ได้\n" +
                "          - แบตเตอรี่ 4400mAh รองรับชาร์จเร็ว 25W, ชาร์จไร้สาย 15W\n" +
                "          - ระบบปฏิบัติการ Android 14 (One UI 6.1.1)\n" +
                "          - ตัวเครื่องขนาด 154.9 x 67.1 x 13.4 ซม. (พับอยู่), 154.9 x 129.9 x 6.1 ซม. (กางออก)\n" +
                "          - ตัวเครื่องน้ำหนัก 253 กรัม");
        products.add(product4);

        Product product5 = new Product();
        product5.setProduct_name("HUAWEI V40 Pro");
        product5.setProduct_image("https://asia-exstatic-vivofs.vivo.com/PSee2l50xoirPK7y/1724140237846/b174a27550eaa33868224acd271a14b1.png");
        product5.setProduct_price(24999);
        product5.setProduct_description("- หน้าจอ LCD Retina HD 4.7 นิ้ว 1334 x 750 พิกเซล \n" +
                "          - ชิป A15 Bionic\n" +
                "          - ความจุ 64GB/128GB/256GB\n" +
                "          - กล้องหลัง 12MP f/1.8\n" +
                "          - กล้องหน้า 7MP f/2.2\n" +
                "          - Touch ID ในปุ่มโฮม\n" +
                "          - กันน้ำ กันฝุ่น IP67\n" +
                "          - รองรับ 5G, Wi-Fi 6, Bluetooth 5.0, NFC\n" +
                "          - พอร์ต Lightning, ไม่มีช่องหูฟัง 3.5 มม.\n" +
                "          - แบตเตอรี่ เล่นวิดีโอ 15 ชม. ฟังเพลง 50 ชม. รองรับชาร์จเร็วและชาร์จไร้สาย\n" +
                "          - ระบบปฏิบัติการ iOS 15\n" +
                "          - ขนาดตัวเครื่อง 138.4 x 67.3 x 7.3 มม. น้ำหนัก 144 กรัม");
        products.add(product5);

        Product product7 = new Product();
        product7.setProduct_name("HUAWEI X100 Pro");
        product7.setProduct_image("https://asia-exstatic-vivofs.vivo.com/PSee2l50xoirPK7y/1705480487721/b0322c9992f70cfd7438b487ca65c6c5.png");
        product7.setProduct_price(37999);
        product7.setProduct_description("หน้าจอ LTPO AMOLED ขนาด 6.78 นิ้ว ความละเอียด QHD+ 1260 x 2800 pixels (453 ppi), Refresh Rate 120Hz, ความสว่างสูงสุด 3000 nits\n" +
                "Android 14, OriginOS 4\n" +
                "Mediatek Dimensity 9300\n" +
                "CPU Octa-core (1×3.25 GHz Cortex-X4 & 3×2.85 GHz Cortex-X4 & 4×2.0 GHz Cortex-A720)\n" +
                "GPU G720 MC12\n" +
                "RAM 12GB/16GB\n" +
                "ROM 256GB/512GB/1TB\n" +
                "กล้องหน้า ความละเอียด 32MP F2.0, (wide)\n" +
                "กล้องหลัง 3 เลนส์ ความละเอียด 50MP F1.8, 23 มม. (wide), 1″, PDAF, Laser AF, OIS + 50MP, F2.5, 100 มม. (periscope telephoto), 1/2″, PDAF, OIS, 4.3x optical zoom, 10x hd zoom, digital zoom 100x + 50MP F2.0, 15 มม., 119 องศา (ultrawide), 1/2.76″, AF\n" +
                "ZEISS Pro + ZEISS T* Coating\n" +
                "กล้องหน้าบันทึกวิดีโอความละเอียด 1080P 60 FPS\n" +
                "กล้องหลังบันทึกวิดีโอความละเอียด 8K 30 FPS, 4K 60 FPS\n" +
                "รองรับมาตรฐานป้องกันฝุ่นและน้ำ IP68\n" +
                "แบตเตอรี่ความจุ 5,400 mAh\n" +
                "รองรับชาร์จไว 100W\n" +
                "รองรับชาร์จไร้สาย 50W\n" +
                "วางจำหน่ายในสี Black, White, Blue, Orange");
        products.add(product7);

        Product product8 = new Product();
        product8.setProduct_name("OPPO Reno12 5G");
        product8.setProduct_image("https://image.oppo.com/content/dam/oppo/common/mkt/v2-2/reno-12-en/navigation/440-440-silver.png.thumb.webp");
        product8.setProduct_price(16999);
        product8.setProduct_description("- หน้าจอ 3D Flexible AMOLED 6.7 นิ้ว FHD+ 120Hz\n" +
                "          - ชิปประมวลผล Dimensity 7300-Energy\n" +
                "          - แรม 12GB\n" +
                "          - ความจุ 256GB/512GB\n" +
                "          - กล้องหลัง 3 เลนส์ Main 50MP OIS + Ultrawide 8MP + Macro 2MP\n" +
                "          - กล้องหน้า 32MP\n" +
                "          - รองรับ 5G, Wi-Fi 6, Bluetooth 5.4, NFC\n" +
                "          - แบตเตอรี่ 5000mAh รองรับชาร์จเร็ว SUPERVOOC 80W\n" +
                "          - ระบบปฏิบัติการ Android 14 (ColorOS 14.1)");
        products.add(product8);

        Product product9 = new Product();
        product9.setProduct_name("OPPO Find N3 Flip");
        product9.setProduct_image("https://image.oppo.com/content/dam/oppo/common/mkt/v2-2/find-n3-flip-en/navigation/find-n3-flip-440_440-gold.png?");
        product9.setProduct_price(26990);
        product9.setProduct_description("ขนาดตัวเครื่อง(เมื่อพับ)  85.5 x 75.8 x 16.5 มิลลิเมตร (เมื่อกาง) 166.4 x 75.8 x 7.8 มิลลิเมตร  \n" +
                "น้ำหนัก 191 กรัม  \n" +
                "หน้าจอด้านใน LTPO AMOLED ขนาด 6.8″ 2520 x 1080 พิกเซล (HDR10+) Refresh Rate 120Hz HDR10+, ความสว่าง 1,200 nits\n" +
                "หน้าจอด้านนอก 3.26 นิ้ว AMOLED ความละเอียด 380 x 720 พิกเซล กระจกแบบ Gorilla Glass 5 ความสว่าง 800 nits\n" +
                "ชิปเซ็ตประมวลผล MediaTek Dimensity 9200+\n" +
                "ชิปกราฟิก : Immortalis-G715 MC11\n" +
                "หน่วยความจำ RAM ขนาด 12GB  \n" +
                "หน่วยความจำภายในความจุ 256 / 512GB  UFS 4.0\n" +
                "การเชื่อมต่อไร้สาย 4G, 5G, Wi-Fi 802.11 a/b/g/n/ac/ax (Wi-Fi 6)/7, Bluetooth 5.3, GPS, A-GPS\n" +
                "กล้องดิจิทัลด้านหน้าความละเอียด 32 ล้านพิกเซล  ถ่ายวิดีโอ Full HD, 4K 30FPS\n" +
                "กล้องดิจิทัลด้านหลังจำนวน 3 ตัว\n" +
                "กล้องตัวหลัก 50 ล้านพิกเซล multi-directional PDAF ขนาดเซนเซอร์ 1/1.56\n" +
                "กล้องตัวที่ 2 ความละเอียด 48 ล้านพิกเซล F/2.2 ให้มุมกว้าง 114 องศา\n" +
                "กล้องตัวที่ 3 ความละเอียด 32 ล้านพิกเซล รองรับการซูม Optical 2x\n" +
                "LED Flash\n" +
                "วิดีโอ 4K 30 FPS, 1080P 240/60/30 FPS\n" +
                "ระบบปลดล็อค Face Recognition และ สแกนนิ้วด้านข้าง  \n" +
                "แบตเตอรี่ความจุ 4300mAh  \n" +
                "ระบบลำโพง Dual Speaker\n" +
                "รองรับ Fast Charge 44W (แบบสาย), การชาร์จไฟไร้สายไม่ได้ระบุ\n" +
                "ทำงานอยู่บนระบบปฏิบัติการ Android 13 + Color OS 13\n" +
                "มาตรฐานกันน้ำ : ไม่ได้ระบุ\n" +
                "สีที่จำหน่ายคือ Astral Black, Moonlit Gold, Mist Rose");
        products.add(product9);

        mAdapter = new MyAdapter(products, this);
        recyclerView.setAdapter(mAdapter);
    }
}
