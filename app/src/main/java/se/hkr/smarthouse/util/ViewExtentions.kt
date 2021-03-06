package se.hkr.smarthouse.util

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.annotation.StringRes
import com.afollestad.materialdialogs.MaterialDialog
import se.hkr.smarthouse.R

fun Context.displayToast(@StringRes message: Int, long: Boolean = false) {
    Toast.makeText(this, message, if (!long) Toast.LENGTH_SHORT else Toast.LENGTH_LONG)
        .show()
}

fun Context.displayToast(message: String, long: Boolean = false) {
    Toast.makeText(this, message, if (!long) Toast.LENGTH_SHORT else Toast.LENGTH_LONG)
        .show()
}

fun Context.displaySuccessDialog(message: String) {
    MaterialDialog(this)
        .show {
            title(R.string.text_success)
            message(text = message)
            positiveButton(R.string.text_ok)
        }
}

fun Context.displayErrorDialog(message: String) {
    MaterialDialog(this)
        .show {
            title(R.string.text_error)
            message(text = message)
            positiveButton(R.string.text_ok)
        }
}

fun ProgressBar.setVisibility(visible: Boolean) {
    this.visibility = if (visible) View.VISIBLE else View.INVISIBLE
}