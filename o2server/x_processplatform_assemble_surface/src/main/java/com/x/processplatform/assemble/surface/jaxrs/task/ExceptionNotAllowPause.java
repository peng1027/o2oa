package com.x.processplatform.assemble.surface.jaxrs.task;

import com.x.base.core.project.exception.PromptException;

class ExceptionNotAllowPause extends PromptException {

	private static final long serialVersionUID = -5515077418025884395L;

	ExceptionNotAllowPause(String id) {
		super("不允许进行待办挂起: {}.", id);
	}

}
