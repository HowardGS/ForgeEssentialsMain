package com.ForgeEssentials.questioner;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class CommandNegative extends QuestionerCommandBase
{

	@Override
	public String getCommandName()
	{
		return "no";
	}
	
	@Override
	public List<String> getCommandAliases()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("decline");
		list.add("deny");
		list.add("take");
		return list;
	}

	@Override
	public void processCommandPlayer(EntityPlayer sender, String[] args)
	{
		QuestionCenter.processAnswer(sender, false);
	}

	@Override
	public void processCommandConsole(ICommandSender sender, String[] args)
	{
		
	}

	@Override
	public boolean canConsoleUseCommand()
	{
		return false;
	}

	@Override
	public boolean canPlayerUseCommand(EntityPlayer player)
	{
		return true;
	}

	@Override
	public String getCommandPerm()
	{
		return null;
	}

}
