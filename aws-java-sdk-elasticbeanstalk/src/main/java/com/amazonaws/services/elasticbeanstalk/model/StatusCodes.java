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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code response.
 * For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html">Status Code
 * Definitions</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/StatusCodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatusCodes implements Serializable, Cloneable {

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
     * </p>
     */
    private Integer status2xx;
    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
     * </p>
     */
    private Integer status3xx;
    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
     * </p>
     */
    private Integer status4xx;
    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
     * </p>
     */
    private Integer status5xx;

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
     * </p>
     * 
     * @param status2xx
     *        The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
     */

    public void setStatus2xx(Integer status2xx) {
        this.status2xx = status2xx;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
     * </p>
     * 
     * @return The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
     */

    public Integer getStatus2xx() {
        return this.status2xx;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
     * </p>
     * 
     * @param status2xx
     *        The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCodes withStatus2xx(Integer status2xx) {
        setStatus2xx(status2xx);
        return this;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
     * </p>
     * 
     * @param status3xx
     *        The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
     */

    public void setStatus3xx(Integer status3xx) {
        this.status3xx = status3xx;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
     * </p>
     * 
     * @return The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
     */

    public Integer getStatus3xx() {
        return this.status3xx;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
     * </p>
     * 
     * @param status3xx
     *        The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCodes withStatus3xx(Integer status3xx) {
        setStatus3xx(status3xx);
        return this;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
     * </p>
     * 
     * @param status4xx
     *        The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
     */

    public void setStatus4xx(Integer status4xx) {
        this.status4xx = status4xx;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
     * </p>
     * 
     * @return The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
     */

    public Integer getStatus4xx() {
        return this.status4xx;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
     * </p>
     * 
     * @param status4xx
     *        The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCodes withStatus4xx(Integer status4xx) {
        setStatus4xx(status4xx);
        return this;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
     * </p>
     * 
     * @param status5xx
     *        The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
     */

    public void setStatus5xx(Integer status5xx) {
        this.status5xx = status5xx;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
     * </p>
     * 
     * @return The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
     */

    public Integer getStatus5xx() {
        return this.status5xx;
    }

    /**
     * <p>
     * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
     * </p>
     * 
     * @param status5xx
     *        The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCodes withStatus5xx(Integer status5xx) {
        setStatus5xx(status5xx);
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
        if (getStatus2xx() != null)
            sb.append("Status2xx: ").append(getStatus2xx()).append(",");
        if (getStatus3xx() != null)
            sb.append("Status3xx: ").append(getStatus3xx()).append(",");
        if (getStatus4xx() != null)
            sb.append("Status4xx: ").append(getStatus4xx()).append(",");
        if (getStatus5xx() != null)
            sb.append("Status5xx: ").append(getStatus5xx());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatusCodes == false)
            return false;
        StatusCodes other = (StatusCodes) obj;
        if (other.getStatus2xx() == null ^ this.getStatus2xx() == null)
            return false;
        if (other.getStatus2xx() != null && other.getStatus2xx().equals(this.getStatus2xx()) == false)
            return false;
        if (other.getStatus3xx() == null ^ this.getStatus3xx() == null)
            return false;
        if (other.getStatus3xx() != null && other.getStatus3xx().equals(this.getStatus3xx()) == false)
            return false;
        if (other.getStatus4xx() == null ^ this.getStatus4xx() == null)
            return false;
        if (other.getStatus4xx() != null && other.getStatus4xx().equals(this.getStatus4xx()) == false)
            return false;
        if (other.getStatus5xx() == null ^ this.getStatus5xx() == null)
            return false;
        if (other.getStatus5xx() != null && other.getStatus5xx().equals(this.getStatus5xx()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus2xx() == null) ? 0 : getStatus2xx().hashCode());
        hashCode = prime * hashCode + ((getStatus3xx() == null) ? 0 : getStatus3xx().hashCode());
        hashCode = prime * hashCode + ((getStatus4xx() == null) ? 0 : getStatus4xx().hashCode());
        hashCode = prime * hashCode + ((getStatus5xx() == null) ? 0 : getStatus5xx().hashCode());
        return hashCode;
    }

    @Override
    public StatusCodes clone() {
        try {
            return (StatusCodes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
