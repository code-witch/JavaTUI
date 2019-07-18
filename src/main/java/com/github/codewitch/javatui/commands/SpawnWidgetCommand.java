package com.github.codewitch.javatui.commands;

import com.github.codewitch.javatui.widgets.Widget;
import me.someonelove.bettercommandsystem.Command;

public class SpawnWidgetCommand extends Command {

    private int x, y;
    private Widget widget;

    public SpawnWidgetCommand() {
        super("spawn");
    }

    @Override
    public void onCommand(boolean hasArgs, String[] args) {
        // hasArgs = whether the user passed any arguments
        // args = the user's passed args, splitted by spaces
        // if the user passes an argument with quotes "like this", "like this" will be one single argument.

        // TODO
    }
}
