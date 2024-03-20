package feature.model

import androidx.annotation.DrawableRes
import java.util.UUID

data class Category(
    var name: String,
    @DrawableRes
    var image: Int,
)
