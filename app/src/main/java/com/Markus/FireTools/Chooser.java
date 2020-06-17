package com.Markus.FireTools;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v17.leanback.app.GuidedStepFragment;
import android.support.v17.leanback.widget.GuidanceStylist;
import android.support.v17.leanback.widget.GuidedAction;

import java.io.IOException;
import java.util.List;

@SuppressWarnings("ALL")
public class Chooser extends GuidedStepFragment {

    private final int ACTION_DISPLAYSOUNDS = 1;
    private final int ACTION_NETWORK = 2;
    private final int ACTION_DEVICES = 3;
    private final int ACTION_ACCESSIBILITY = 4;
    private final int ACTION_APPS = 5;
    private final int ACTION_PREFERENCES = 6;
    private final int ACTION_DEVICE = 7;
    private final int ACTION_SLEEP = 8;
    private final int ACTION_APPSTORE = 9;
    private final int ACTION_NOTIFICATIONS = 10;
    private final int ACTION_LANGUAGE = 11;
    private final int ACTION_SUPERSU = 12;
    private final int ACTION_XPOSED = 13;
    private final int ACTION_VNC = 14;
    private final int ACTION_ACCOUNT = 15;
    private final int ACTION_MONITORING = 16;
    private final int ACTION_DEVELOPER = 17;
    private final int ACTION_RESET = 18;
    private final int ACTION_EQUIPMENT = 19;

    private static void addAction(List<GuidedAction> actions,long id, String title, String desc){
        actions.add(new GuidedAction.Builder()
                .id(id)
                .title(title)
                .description(desc)
                .build());
    }

    @NonNull
    @Override
    public GuidanceStylist.Guidance onCreateGuidance(Bundle savedInstanceState) {
        String title = getString(R.string.app_name);
        String breadcrumb = getString(R.string.two_opts_nix);
        String description = getString(R.string.two_opts_nix);
        Drawable icon = getActivity().getDrawable(R.drawable.ic_hud_settings_stick);
        return new GuidanceStylist.Guidance(title, description, breadcrumb, icon);

    }

    @Override
    public void onCreateActions(@NonNull List<GuidedAction> actions, Bundle savedInstanceState) {
        super.onCreateButtonActions(actions,savedInstanceState);
        addAction(actions,ACTION_SLEEP,getString(R.string.two_opts_res3)," ");
        addAction(actions,ACTION_DISPLAYSOUNDS,getString(R.string.two_opts_display)," ");
        addAction(actions,ACTION_NETWORK,getString(R.string.two_opts_net)," ");
        addAction(actions,ACTION_DEVICES,getString(R.string.two_opts_dev)," ");
        addAction(actions,ACTION_ACCESSIBILITY,getString(R.string.two_opts_access)," ");
        addAction(actions,ACTION_APPS,getString(R.string.two_opts_app)," ");
        addAction(actions,ACTION_PREFERENCES,getString(R.string.two_opts_pref)," ");
        addAction(actions,ACTION_DEVICE,getString(R.string.two_opts_device)," ");
        addAction(actions,ACTION_EQUIPMENT,getString(R.string.two_opts_res2)," ");
        addAction(actions,ACTION_NOTIFICATIONS,getString(R.string.two_opts_res1)," ");
        addAction(actions,ACTION_ACCOUNT,getString(R.string.two_opts_account)," ");

    }

    @Override
    public void onGuidedActionClicked(GuidedAction action) {
        super.onGuidedActionClicked(action);
        if (action.getId() == ACTION_DISPLAYSOUNDS)         {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.device.settings.action.DISPLAY_AND_SOUNDS -n com.amazon.tv.settings.v2/.tv.display_sounds.DisplayAndSoundsActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);

    }
        if (action.getId() == ACTION_NETWORK) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.device.settings.action.ADD_NETWORK -n com.amazon.tv.settings.v2/.tv.network.NetworkActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_DEVICES) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.device.settings.action.CONTROLLERS -n com.amazon.tv.settings.v2/.tv.controllers_bluetooth_devices.ControllersAndBluetoothActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_ACCESSIBILITY) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.device.settings.action.ACCESSIBILITY -n com.amazon.tv.settings.v2/.tv.accessibility.AccessibilityActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_APPS) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.device.settings.action.APPLICATIONS -n com.amazon.tv.settings.v2/.tv.applications.ApplicationsActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_PREFERENCES) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.device.settings.action.PREFERENCES -n com.amazon.tv.settings.v2/.tv.preferences.PreferencesActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_DEVICE) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.device.settings.action.DEVICE -n com.amazon.tv.settings.v2/.tv.device.DeviceActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_SLEEP) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c input keyevent 223");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_EQUIPMENT) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.tv.oobe.settings.ACTION.DEVICE_CONTROL -n com.amazon.tv.devicecontrolsettings/.screens.main_menu.OzOobeSettingsActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_NOTIFICATIONS) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.tv.action.NOTIFICATION_CENTER -n com.amazon.tv.notificationcenter/.NotificationCenterActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_LANGUAGE) {
            Intent localIntent = new Intent();
            localIntent.setPackage("eu.chainfire.supersu");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.preferences.LanguageSelectActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_SUPERSU) {
            Intent localIntent = new Intent();
            localIntent.setPackage("eu.chainfire.supersu");
            localIntent.setComponent(ComponentName.unflattenFromString("eu.chainfire.supersu/.MainActivity-Material"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_XPOSED) {
            Intent localIntent = new Intent();
            localIntent.setPackage("de.robv.android.xposed.installer");
            localIntent.setComponent(ComponentName.unflattenFromString("de.robv.android.xposed.installer/.WelcomeActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_VNC) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.vmlite.vncserver");
            localIntent.setComponent(ComponentName.unflattenFromString("com.vmlite.vncserver/.MainActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_ACCOUNT) {
            Intent localIntent = new Intent();
            try {
                Runtime.getRuntime().exec("su -c am start -a com.amazon.device.settings.action.MY_ACCOUNT -n com.amazon.tv.settings.v2/.tv.my_account.MyAccountActivity");
            } catch (IOException e) {
                e.printStackTrace();
            }
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_MONITORING) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.preferences.data_monitoring.DataMonitoringActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_DEVELOPER) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.ssm");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.ssm/.ControlPanel"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_RESET) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.FactoryResetActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
    }
}
