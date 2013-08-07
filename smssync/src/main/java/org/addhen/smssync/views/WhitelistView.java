/*****************************************************************************
 ** Copyright (c) 2010 - 2012 Ushahidi Inc
 ** All rights reserved
 ** Contact: team@ushahidi.com
 ** Website: http://www.ushahidi.com
 **
 ** GNU Lesser General Public License Usage
 ** This file may be used under the terms of the GNU Lesser
 ** General Public License version 3 as published by the Free Software
 ** Foundation and appearing in the file LICENSE.LGPL included in the
 ** packaging of this file. Please review the following information to
 ** ensure the GNU Lesser General Public License version 3 requirements
 ** will be met: http://www.gnu.org/licenses/lgpl.html.
 **
 **
 ** If you have questions regarding the use of this file, please contact
 ** Ushahidi developers at team@ushahidi.com.
 **
 *****************************************************************************/

package org.addhen.smssync.views;

import org.addhen.smssync.R;

import android.app.Activity;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

public class WhitelistView extends View {

    @Widget(R.id.enable_whitelist_checkbox)
    public CheckBox enableWhitelist;

    @Widget(R.id.loading_list_progress)
    public ProgressBar listLoadingProgress;

    @Widget(R.id.empty_list)
    public TextView emptyView;

    public WhitelistView(Activity activity) {
        super(activity);
        emptyView.setText(R.string.no_whitelist);
    }

}
