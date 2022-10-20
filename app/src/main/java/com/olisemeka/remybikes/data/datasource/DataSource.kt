package com.olisemeka.remybikes.data.datasource

import android.text.SpannableString
import com.olisemeka.remybikes.data.model.Accessory
import com.olisemeka.remybikes.data.model.Bike

object DataSource {
    fun getBikeData(): ArrayList<Bike>{
        return arrayListOf(
            Bike("Falkenjagd ARISTOS R SPEEDGRAVEL GET FAST", 9000, "Falkenjagd",
            "https://images.bike24.net/media/720/i/mb/98/b8/49/falkenjagd-aristos-r-speed-gravel-01-1326784.jpg",
            true, 0.0, 0,
                SpannableString("\tAluminium Body Work\n\n\t2 sets of wheels\n\n\t1 tyre pump\n\n\tSpare Pedals\n\n\tMini tool pack")
            ),
            Bike("Rennstahl 853 Pinion - 650B Trekking Bike", 5800, "Rennstahl",
            "https://images.bike24.net/media/720/i/mb/3c/87/ed/rennstahl-853-pinion-reiserad-p1-1124081.jpg",
            true, 5.0, 6,  SpannableString("\tAluminium Body Work\n\n\t2 sets of wheels\n\n\t1 tyre pump\n\n\tSpare Pedals\n\n\tMini tool pack")
            ),
            Bike("Cannondale SUPERSIX EVO Disc - Ultegra Carbon Roadbike", 4000, "Cannondale",
            "https://images.bike24.net/media/720/i/mb/ed/30/66/supersix-evo-ultegra-847572.jpg",
            true, 0.0, 0,  SpannableString("\tAluminium Body Work\n\n\t2 sets of wheels\n\n\t1 tyre pump\n\n\tSpare Pedals\n\n\tMini tool pack")
            ),
            Bike("Cannondale SCALPEL CARBON SE 2 - 29\" Mountainbike 2022 Black Magic", 3750, "Cannondale",
            "https://images.bike24.net/media/720/i/mb/93/fa/6c/scalpel-carbon-se-2-black-magic-1099047.jpg",
            true, 0.0, 0,  SpannableString("\tAluminium Body Work\n\n\t2 sets of wheels\n\n\t1 tyre pump\n\n\tSpare Pedals\n\n\tMini tool pack")
            ),
            Bike("vsf fahrradmanufaktur TX-1000 Rohloff Disc", 3800, "vsf fahrradmanufaktur",
            "https://images.bike24.net/media/720/i/mb/a4/20/f0/102220046-vsf-tx-1000-rohloff-14g-disc-gates-dia-1089160.jpg",
            true, 0.0, 0,  SpannableString("\tAluminium Body Work\n\n\t2 sets of wheels\n\n\t1 tyre pump\n\n\tSpare Pedals\n\n\tMini tool pack")
            ),
            Bike("Bianchi OLTRE XR4 Disc - Red eTap AXS - Carbon Roadbike", 9800, "Bianchi",
            "https://images.bike24.net/media/720/i/mb/49/19/f4/yrb09ixc-bianchi-oltre-xr4-sram-etap-axs-graphite-race-ck16-1113543.jpg",
            true, 0.0, 0,  SpannableString("\tAluminium Body Work\n\n\t2 sets of wheels\n\n\t1 tyre pump\n\n\tSpare Pedals\n\n\tMini tool pack")
            ),
            Bike("Cannondale SCALPEL CARBON SE 1 - 29\" Mountainbike 2021 Abyss", 4700, "Cannondale",
            "https://images.bike24.net/media/720/i/mb/76/fb/a3/scalpel-carbon-se-1-abyss-01-1004679.jpg",
            true, 0.0, 0,  SpannableString("Aluminium Body Work\n2 sets of wheels\n1 tyre pump\nSpare Pedals\nMini tool pack")
            ),
            Bike("Trek DOMANE SL 5 105 Roadbike Gen. 3 - 2023 - Rage Red", 3000, "Trek",
            "https://images.bike24.net/media/720/i/mb/e4/68/d2/domanesl5-22-35298-b-primary-1101581.jpg",
            true, 0.0, 0,  SpannableString("Aluminium Body Work\n2 sets of wheels\n1 tyre pump\nSpare Pedals\nMini tool pack")
            ),
            Bike("Ghost Riot Enduro Full Party - Mountainbike", 3600, "Ghost",
            "https://images.bike24.net/media/720/i/mb/6e/8a/22/93ri1062-ghost-21-riot-enduro-fullparty-al-gry-blk-1090933.jpg",
            true, 0.0, 0,  SpannableString("Aluminium Body Work\n2 sets of wheels\n1 tyre pump\nSpare Pedals\nMini tool pack")
            ),
            Bike("CUBE KATHMANDU EXC - Trekking Bike", 1400, "CUBE",
            "https://images.bike24.net/media/720/i/mb/57/c6/b1/kathmandu-exc-darkgrey-grey-1092051.jpg",
            true, 0.0, 0,  SpannableString("Aluminium Body Work\n2 sets of wheels\n1 tyre pump\nSpare Pedals\nMini tool pack"))
        )
    }

    fun getAccessoryData(): ArrayList<Accessory>{
        return arrayListOf(
            Accessory("Tacx NEO 2T Bundle - Smart Cycletrainer + Motion Plates + Mat", 1130,
                "https://images.bike24.net/media/720/i/mb/95/d3/5a/tacx-neo-2t-bundle-1325944.jpg", true, 0.0, 0
            ),
            Accessory("Busch + Müller LEVAL E-Bike Bending Light Assistant for Front Light", 90,
            "https://images.bike24.net/media/720/i/mb/91/da/ae/busch-mueller-365-leval-kurvenlichtadapter-main-1154167.jpg", true, 0.0, 0
            ),
            Accessory("Veloheld iconX - Frame Set with Steel Fork", 900,
                "https://images.bike24.net/media/720/i/mb/19/99/7d/iconx-frame-steelfork-glokzin-teal-glossy-1-985567.jpg", true, 0.0, 0
            ),
            Accessory("SRAM RED eTap AXS HRD 2x12 Upgrade Set with Hydraulic Disc Brakes - Flat Mount - 6-Bolt", 1620,
            "https://images.bike24.net/media/720/i/mb/7f/d3/bc/363229-00-d-782990.jpg", true, 0.0, 0
            ),
            Accessory("sailfish Mens Ignite Wetsuit", 240, "https://images.bike24.net/media/720/i/mb/1e/93/1a/366573-00-d-791428.jpg",
            true, 0.0, 0),
            Accessory("Bombtrack MACHI Jersey", 50, "https://images.bike24.net/media/720/i/mb/7e/f3/7b/bombtrack-machi-jersey-black-white-1117885.jpg",
            true, 0.0, 0)
        )
    }
}