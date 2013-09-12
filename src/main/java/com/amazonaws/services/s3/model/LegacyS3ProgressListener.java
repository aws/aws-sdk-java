package com.amazonaws.services.s3.model;

public class LegacyS3ProgressListener implements com.amazonaws.util.ProgressListener {

    @SuppressWarnings("deprecation")
    private final ProgressListener listener;

    @SuppressWarnings("deprecation")
    public LegacyS3ProgressListener(final ProgressListener listener) {
        this.listener = listener;
    }

    @SuppressWarnings("deprecation")
    public ProgressListener unwrap() {
        return listener;
    }

    @SuppressWarnings("deprecation")
    public void progressChanged(com.amazonaws.event.ProgressEvent progressEvent) {
        listener.progressChanged(transform(progressEvent));
    }

    @SuppressWarnings("deprecation")
    private ProgressEvent transform(com.amazonaws.event.ProgressEvent event) {
        return new ProgressEvent(event.getEventCode(), event.getBytesTransferred());
    }

}
