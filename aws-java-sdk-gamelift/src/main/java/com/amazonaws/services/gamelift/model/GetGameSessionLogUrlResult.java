/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetGameSessionLogUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGameSessionLogUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Location of the requested game session logs, available for download. This URL is valid for 15 minutes, after
     * which S3 will reject any download request using this URL. You can request a new URL any time within the 14-day
     * period that the logs are retained.
     * </p>
     */
    private String preSignedUrl;

    /**
     * <p>
     * Location of the requested game session logs, available for download. This URL is valid for 15 minutes, after
     * which S3 will reject any download request using this URL. You can request a new URL any time within the 14-day
     * period that the logs are retained.
     * </p>
     * 
     * @param preSignedUrl
     *        Location of the requested game session logs, available for download. This URL is valid for 15 minutes,
     *        after which S3 will reject any download request using this URL. You can request a new URL any time within
     *        the 14-day period that the logs are retained.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * Location of the requested game session logs, available for download. This URL is valid for 15 minutes, after
     * which S3 will reject any download request using this URL. You can request a new URL any time within the 14-day
     * period that the logs are retained.
     * </p>
     * 
     * @return Location of the requested game session logs, available for download. This URL is valid for 15 minutes,
     *         after which S3 will reject any download request using this URL. You can request a new URL any time within
     *         the 14-day period that the logs are retained.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * Location of the requested game session logs, available for download. This URL is valid for 15 minutes, after
     * which S3 will reject any download request using this URL. You can request a new URL any time within the 14-day
     * period that the logs are retained.
     * </p>
     * 
     * @param preSignedUrl
     *        Location of the requested game session logs, available for download. This URL is valid for 15 minutes,
     *        after which S3 will reject any download request using this URL. You can request a new URL any time within
     *        the 14-day period that the logs are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGameSessionLogUrlResult withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGameSessionLogUrlResult == false)
            return false;
        GetGameSessionLogUrlResult other = (GetGameSessionLogUrlResult) obj;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetGameSessionLogUrlResult clone() {
        try {
            return (GetGameSessionLogUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
