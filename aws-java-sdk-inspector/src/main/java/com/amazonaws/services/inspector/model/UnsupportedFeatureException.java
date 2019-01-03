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
package com.amazonaws.services.inspector.model;

import javax.annotation.Generated;

/**
 * <p>
 * Used by the <a>GetAssessmentReport</a> API. The request was rejected because you tried to generate a report for an
 * assessment run that existed before reporting was supported in Amazon Inspector. You can only generate reports for
 * assessment runs that took place or will take place after generating reports in Amazon Inspector became available.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedFeatureException extends com.amazonaws.services.inspector.model.AmazonInspectorException {
    private static final long serialVersionUID = 1L;

    private Boolean canRetry;

    /**
     * Constructs a new UnsupportedFeatureException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnsupportedFeatureException(String message) {
        super(message);
    }

    /**
     * @param canRetry
     */

    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    public void setCanRetry(Boolean canRetry) {
        this.canRetry = canRetry;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    public Boolean getCanRetry() {
        return this.canRetry;
    }

    /**
     * @param canRetry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedFeatureException withCanRetry(Boolean canRetry) {
        setCanRetry(canRetry);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCanRetry() {
        return this.canRetry;
    }

}
