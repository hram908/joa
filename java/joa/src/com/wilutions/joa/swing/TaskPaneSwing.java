package com.wilutions.joa.swing;

import com.wilutions.com.AsyncResult;
import com.wilutions.joa.TaskPane;

/**
 * Taks pane base class for Java Swing views.
 *
 */
public abstract class TaskPaneSwing extends TaskPane implements FrameContentFactory {

	protected final EmbeddedFrameSwing embeddedFrame = new EmbeddedFrameSwing();

	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult) {
		embeddedFrame.createAndShowEmbeddedWindowAsync(hwndParent, this, asyncResult);
	}

	@Override
	public long getWindowHandle() {
		return embeddedFrame.getWindowHandle();
	}

	@Override
	public void close() {
		super.close();
		embeddedFrame.close();
	}
}
