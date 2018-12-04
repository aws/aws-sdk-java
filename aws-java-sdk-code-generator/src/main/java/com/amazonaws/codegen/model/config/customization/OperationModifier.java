/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.model.config.customization;

/**
 * Use operationModifiers customization to exclude a given operation, or add a
 * wrapper around the result shape.
 */
public class OperationModifier {

    private boolean exclude;

    private boolean useWrappingResult;
    private String wrappedResultShape;
    private String wrappedResultMember;

    /**
     * @return true if this operation should be excluded when processing the
     *         service model.
     */
    public boolean isExclude() {
        return exclude;
    }

    public void setExclude(boolean exclude) {
        this.exclude = exclude;
    }

    /**
     * @return true if the output shape of this operation is a thin wrapper
     *         around the real logical result (e.g., EC2 Reservation wrapped by
     *         RunInstancesResult), and that we want to directly return the
     *         unwrapped result in the generated client.
     */
    public boolean isUseWrappingResult() {
        return useWrappingResult;
    }

    public void setUseWrappingResult(boolean useWrappingResult) {
        this.useWrappingResult = useWrappingResult;
    }

    /**
     * @return the shape of the member that represents the wrapped result.
     * @see {{@link #isUseWrappingResult()}
     */
    public String getWrappedResultShape() {
        return wrappedResultShape;
    }

    public void setWrappedResultShape(String wrappedResultShape) {
        this.wrappedResultShape = wrappedResultShape;
    }

    /**
     * @return the name of the member that represents the wrapped result.
     * @see {{@link #isUseWrappingResult()}
     */
    public String getWrappedResultMember() {
        return wrappedResultMember;
    }

    public void setWrappedResultMember(String wrappedResultMember) {
        this.wrappedResultMember = wrappedResultMember;
    }

}
