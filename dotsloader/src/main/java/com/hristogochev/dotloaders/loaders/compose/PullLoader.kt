package com.hristogochev.dotloaders.loaders.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.viewinterop.AndroidView
import com.hristogochev.dotloaders.loaders.PullLoader

/**
 * Created by hristogochev on 01/02/23.
 */

@Composable
fun PullLoader(
    modifier: Modifier = Modifier,
    radius: Dp? = null,
    dotRadius: Dp? = null,
    dotColor: Color? = null,
    animDuration: Long? = null,
    toggleOnVisibilityChange: Boolean? = null,
    onUpdate: (PullLoader) -> Unit = {}
) {
    val dotRadiusPx = with(LocalDensity.current) { dotRadius?.toPx() }
    val radiusPx = with(LocalDensity.current) { radius?.toPx() }
    AndroidView(modifier = modifier, factory = {
        PullLoader(
            context = it,
            dotsRadius = dotRadiusPx,
            radius = radiusPx,
            dotColor = dotColor?.toArgb(),
            animDuration = animDuration,
            toggleOnVisibilityChange = toggleOnVisibilityChange
        )
    }, update = onUpdate)
}

@Composable
fun PullLoader(
    modifier: Modifier = Modifier,
    radius: Dp? = null,
    dotRadius: Dp? = null,
    dotColors: List<Color>? = null,
    animDuration: Long? = null,
    toggleOnVisibilityChange: Boolean? = null,
    onUpdate: (PullLoader) -> Unit = {}
) {
    val dotRadiusPx = with(LocalDensity.current) { dotRadius?.toPx() }
    val radiusPx = with(LocalDensity.current) { radius?.toPx() }
    AndroidView(modifier = modifier, factory = {
        PullLoader(
            context = it,
            dotRadius = dotRadiusPx,
            radius = radiusPx,
            dotColors = dotColors?.map { color -> color.toArgb() }?.toIntArray(),
            animDuration = animDuration,
            toggleOnVisibilityChange = toggleOnVisibilityChange
        )
    }, update = onUpdate)
}

