package ni.devotion.floaty_head

interface FloatingBubbleTouchListener {
    fun onTap(expanded: Boolean)
    fun onRemove()
    fun onUp(x: Float, y: Float)
    fun onDown(x: Float, y: Float)
    fun onMove(x: Float, y: Float)
}