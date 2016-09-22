/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to create a new IP address filter. You use IP address filters when you receive email with Amazon
 * SES. For more information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 */
public class CreateReceiptFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A data structure that describes the IP address filter to create, which consists of a name, an IP address range,
     * and whether to allow or block mail from it.
     * </p>
     */
    private ReceiptFilter filter;

    /**
     * <p>
     * A data structure that describes the IP address filter to create, which consists of a name, an IP address range,
     * and whether to allow or block mail from it.
     * </p>
     * 
     * @param filter
     *        A data structure that describes the IP address filter to create, which consists of a name, an IP address
     *        range, and whether to allow or block mail from it.
     */

    public void setFilter(ReceiptFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A data structure that describes the IP address filter to create, which consists of a name, an IP address range,
     * and whether to allow or block mail from it.
     * </p>
     * 
     * @return A data structure that describes the IP address filter to create, which consists of a name, an IP address
     *         range, and whether to allow or block mail from it.
     */

    public ReceiptFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A data structure that describes the IP address filter to create, which consists of a name, an IP address range,
     * and whether to allow or block mail from it.
     * </p>
     * 
     * @param filter
     *        A data structure that describes the IP address filter to create, which consists of a name, an IP address
     *        range, and whether to allow or block mail from it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReceiptFilterRequest withFilter(ReceiptFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReceiptFilterRequest == false)
            return false;
        CreateReceiptFilterRequest other = (CreateReceiptFilterRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public CreateReceiptFilterRequest clone() {
        return (CreateReceiptFilterRequest) super.clone();
    }
}
