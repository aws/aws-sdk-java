/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListMobileSdkReleases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMobileSdkReleasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The device platform to retrieve the list for.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The maximum number of objects that you want WAF to return for this request. If more objects are available, in the
     * response, WAF provides a <code>NextMarker</code> value that you can use in a subsequent call to get the next
     * batch of objects.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The device platform to retrieve the list for.
     * </p>
     * 
     * @param platform
     *        The device platform to retrieve the list for.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The device platform to retrieve the list for.
     * </p>
     * 
     * @return The device platform to retrieve the list for.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The device platform to retrieve the list for.
     * </p>
     * 
     * @param platform
     *        The device platform to retrieve the list for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ListMobileSdkReleasesRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The device platform to retrieve the list for.
     * </p>
     * 
     * @param platform
     *        The device platform to retrieve the list for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ListMobileSdkReleasesRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *         still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *         response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *         request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileSdkReleasesRequest withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects that you want WAF to return for this request. If more objects are available, in the
     * response, WAF provides a <code>NextMarker</code> value that you can use in a subsequent call to get the next
     * batch of objects.
     * </p>
     * 
     * @param limit
     *        The maximum number of objects that you want WAF to return for this request. If more objects are available,
     *        in the response, WAF provides a <code>NextMarker</code> value that you can use in a subsequent call to get
     *        the next batch of objects.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of objects that you want WAF to return for this request. If more objects are available, in the
     * response, WAF provides a <code>NextMarker</code> value that you can use in a subsequent call to get the next
     * batch of objects.
     * </p>
     * 
     * @return The maximum number of objects that you want WAF to return for this request. If more objects are
     *         available, in the response, WAF provides a <code>NextMarker</code> value that you can use in a subsequent
     *         call to get the next batch of objects.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of objects that you want WAF to return for this request. If more objects are available, in the
     * response, WAF provides a <code>NextMarker</code> value that you can use in a subsequent call to get the next
     * batch of objects.
     * </p>
     * 
     * @param limit
     *        The maximum number of objects that you want WAF to return for this request. If more objects are available,
     *        in the response, WAF provides a <code>NextMarker</code> value that you can use in a subsequent call to get
     *        the next batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileSdkReleasesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMobileSdkReleasesRequest == false)
            return false;
        ListMobileSdkReleasesRequest other = (ListMobileSdkReleasesRequest) obj;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListMobileSdkReleasesRequest clone() {
        return (ListMobileSdkReleasesRequest) super.clone();
    }

}
