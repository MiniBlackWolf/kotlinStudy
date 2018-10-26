package study.kotin.my.mycenter.ui.activity

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import com.bin.david.form.core.TableConfig
import com.bin.david.form.data.CellInfo
import com.bin.david.form.data.column.Column
import com.bin.david.form.data.format.draw.IDrawFormat
import com.bin.david.form.data.table.ArrayTableData
import com.bin.david.form.utils.DensityUtils
import kotlinx.android.synthetic.main.my_class.*
import study.kotin.my.baselibrary.ui.activity.BaseMVPActivity
import study.kotin.my.mycenter.R
import study.kotin.my.mycenter.persenter.Mypersenter

class MyClassActivity : BaseMVPActivity<Mypersenter>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_class)

        val String = arrayOf("周一", "周二", "周三", "周四", "周五", "周六", "周日")
        val String2 = arrayOf(1, 2, 3, 4, 5, 6, 7, "自习")
        val infos = arrayOf(arrayOf(0, 1, 2, 1, 1, 0, 1, 1, 0, 1, 1, 2, 3), arrayOf(4, 2, 1, 1, 0, 1, 1, 0, 1, 1, 2, 2, 3))
        val arrayTableData = ArrayTableData.create("课表", String, infos, object : IDrawFormat<Int> {
            override fun measureWidth(column: Column<Int>?, position: Int, config: TableConfig?): Int {
                return DensityUtils.dp2px(mpersenter.context, 50f)
            }

            override fun measureHeight(column: Column<Int>?, position: Int, config: TableConfig?): Int {
                return DensityUtils.dp2px(mpersenter.context, 50f)
            }

            override fun draw(c: Canvas?, rect: Rect?, cellInfo: CellInfo<Int>?, config: TableConfig?) {
                val paint = config!!.getPaint()
                var color: Int
                when (cellInfo!!.data) {
                    1 -> color = R.color.design_fab_shadow_start_color
                    2 -> color = R.color.colorAccent
                }
                //绘制正方形
                c!!.drawRect(rect!!.left + 5f, rect.top + 5f, rect.right - 5f, rect.bottom - 5f, paint)
            }

        })

        table.tableData=arrayTableData

    }
}