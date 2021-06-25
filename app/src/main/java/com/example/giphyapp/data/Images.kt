package com.example.giphyapp.data

data class Images(
    val fixedHeight: FixedHeight,
    val fixedHeightStill: Still,
    val fixedHeightDownsampled: FixedHeight,
    val fixedWidth: FixedHeight,
    val fixedWidthStill: Still,
    val fixedWidthDownsampled: FixedHeight,
    val fixedHeightSmall: FixedHeight,
    val fixedHeightSmallStill: Still,
    val fixedWidthSmall: FixedHeight,
    val fixedWidthSmallStill: Still,
    val downsized: Still,
    val downsizedStill: Still,
    val downsizedLarge: Still,
    val downsizedMedium: Still,
    val downsizedSmall: DownsizedSmall,
    val original: FixedHeight,
    val originalStill: Still,
    val looping: Looping,
    val preview: DownsizedSmall,
    val previewGIF: Still,
    val previewWebp: Still,
    val the480WStill: Still,
                  )
