content = chatRequest.system("你是一个会回答通知公告相关问题的助手")
				.user(msg)
				.advisors(
					retrievalAugmentationAdvisor
				)
				.tools(diTools)
				.stream()
				.content();
