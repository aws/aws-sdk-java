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
package com.amazonaws.services.workdocs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource does not exist.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityNotExistsException extends com.amazonaws.services.workdocs.model.AmazonWorkDocsException {
    private static final long serialVersionUID = 1L;

    private java.util.List<String> entityIds;

    /**
     * Constructs a new EntityNotExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public EntityNotExistsException(String message) {
        super(message);
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("EntityIds")
    public java.util.List<String> getEntityIds() {
        return entityIds;
    }

    /**
     * @param entityIds
     */

    @com.fasterxml.jackson.annotation.JsonProperty("EntityIds")
    public void setEntityIds(java.util.Collection<String> entityIds) {
        if (entityIds == null) {
            this.entityIds = null;
            return;
        }

        this.entityIds = new java.util.ArrayList<String>(entityIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityIds(java.util.Collection)} or {@link #withEntityIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityNotExistsException withEntityIds(String... entityIds) {
        if (this.entityIds == null) {
            setEntityIds(new java.util.ArrayList<String>(entityIds.length));
        }
        for (String ele : entityIds) {
            this.entityIds.add(ele);
        }
        return this;
    }

    /**
     * @param entityIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityNotExistsException withEntityIds(java.util.Collection<String> entityIds) {
        setEntityIds(entityIds);
        return this;
    }

}
