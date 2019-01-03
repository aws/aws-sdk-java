/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.internal;

import java.util.Date;

import com.amazonaws.services.s3.Headers;

/**
 * Interface for service responses that receive the x-amz-restore header.
 *
 * @see Headers#RESTORE
 */
public interface ObjectRestoreResult {

    /**
     * Returns the expiration date when the Object is scheduled to move to Amazon Glacier, or null if the object is not
     * configured to expire.
     */
    public Date getRestoreExpirationTime();

    /**
     * Sets the expiration date when the Object is scheduled to move to Amazon Glacier.
     *
     * @param expiration
     *            The date the object will expire.
     */
    public void setRestoreExpirationTime(Date expiration);

    /**
     * Sets a boolean value which indicates there is an ongoing restore request.
     * @param ongoingRestore
     */
    public void setOngoingRestore(boolean ongoingRestore);

    /**
     * Returns then  boolean value which indicates there is an ongoing restore request.
     */
    public Boolean getOngoingRestore();
}
