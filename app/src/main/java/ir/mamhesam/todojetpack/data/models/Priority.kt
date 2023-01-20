package ir.mamhesam.todojetpack.data.models

import androidx.compose.ui.graphics.Color
import ir.mamhesam.todojetpack.ui.theme.HighPriorityColor
import ir.mamhesam.todojetpack.ui.theme.LowPriorityColor
import ir.mamhesam.todojetpack.ui.theme.MediumPriorityColor
import ir.mamhesam.todojetpack.ui.theme.NonePriorityColor

enum class Priority(val color: Color)
{
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}