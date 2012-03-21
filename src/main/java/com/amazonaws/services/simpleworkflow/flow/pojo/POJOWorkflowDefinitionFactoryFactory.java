/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.pojo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.JsonDataConverter;
import com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions;
import com.amazonaws.services.simpleworkflow.flow.annotations.Execute;
import com.amazonaws.services.simpleworkflow.flow.annotations.GetState;
import com.amazonaws.services.simpleworkflow.flow.annotations.NullDataConverter;
import com.amazonaws.services.simpleworkflow.flow.annotations.Signal;
import com.amazonaws.services.simpleworkflow.flow.annotations.SkipTypeRegistration;
import com.amazonaws.services.simpleworkflow.flow.annotations.Workflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.WorkflowRegistrationOptions;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactory;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactoryFactory;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class POJOWorkflowDefinitionFactoryFactory extends WorkflowDefinitionFactoryFactory {

    private DataConverter converter = new JsonDataConverter();

    private List<WorkflowType> workflowTypesToRegister = new ArrayList<WorkflowType>();

    private Map<WorkflowType, WorkflowDefinitionFactory> factories = new HashMap<WorkflowType, WorkflowDefinitionFactory>();

    private final Collection<Class<?>> workflowImplementationTypes = new ArrayList<Class<?>>();

    public DataConverter getDataConverter() {
        return converter;
    }

    public void setDataConverter(DataConverter converter) {
        this.converter = converter;
    }

    @Override
    public WorkflowDefinitionFactory getWorkflowDefinitionFactory(WorkflowType workflowType) {
        return factories.get(workflowType);
    }

    @Override
    public Iterable<WorkflowType> getWorkflowTypesToRegister() {
        return workflowTypesToRegister;
    }

    public void addWorkflowImplementationType(Class<?> workflowImplementationType)
            throws InstantiationException, IllegalAccessException {
        addWorkflowImplementationType(workflowImplementationType, null);
    }

    public void addWorkflowImplementationType(Class<?> workflowImplementationType, DataConverter converterOverride)
            throws InstantiationException, IllegalAccessException {
        if (workflowImplementationType.isInterface()) {
            throw new IllegalArgumentException(workflowImplementationType + " has to be a instantiatable class");
        }
        Set<Class<?>> implementedInterfaces = new HashSet<Class<?>>();
        getImplementedInterfacesAnnotatedWithWorkflow(workflowImplementationType, implementedInterfaces);
        if (implementedInterfaces.size() == 0) {
            throw new IllegalArgumentException("Workflow definition does not implement any @Workflow interface. "
                    + workflowImplementationType);
        }
        for (Class<?> interfaze : implementedInterfaces) {
            addWorkflowType(interfaze, workflowImplementationType, converterOverride);
        }
    }

    public void setWorkflowImplementationTypes(Collection<Class<?>> workflowImplementationTypes)
            throws InstantiationException, IllegalAccessException {
        for (Class<?> type : workflowImplementationTypes) {
            addWorkflowImplementationType(type);
        }
    }

    public Collection<Class<?>> getWorkflowImplementationTypes() {
        return workflowImplementationTypes;
    }

    private void addWorkflowType(Class<?> interfaze, Class<?> workflowImplementationType, DataConverter converterOverride)
            throws InstantiationException, IllegalAccessException {
        Workflow workflowAnnotation = interfaze.getAnnotation(Workflow.class);
        String interfaceName = interfaze.getSimpleName();
        MethodConverterPair workflowImplementationMethod = null;
        MethodConverterPair getStateMethod = null;
        WorkflowType workflowType = null;
        WorkflowTypeRegistrationOptions registrationOptions = null;
        Map<String, MethodConverterPair> signals = new HashMap<String, MethodConverterPair>();
        for (Method method : interfaze.getMethods()) {
            if (method.getDeclaringClass().getAnnotation(Workflow.class) == null) {
                continue;
            }
            Execute executeAnnotation = method.getAnnotation(Execute.class);
            Signal signalAnnotation = method.getAnnotation(Signal.class);
            GetState getStateAnnotation = method.getAnnotation(GetState.class);
            checkAnnotationUniqueness(method, executeAnnotation, signalAnnotation, getStateAnnotation);
            if (executeAnnotation != null) {
                if (workflowImplementationMethod != null) {
                    throw new IllegalArgumentException(
                            "Interface annotated with @Workflow is allowed to have only one method annotated with @Execute. Found "
                                    + getMethodFullName(workflowImplementationMethod.getMethod()) + " and "
                                    + getMethodFullName(method));
                }
                if (!method.getReturnType().equals(void.class) && !(Promise.class.isAssignableFrom(method.getReturnType()))) {
                    throw new IllegalArgumentException(
                            "Workflow implementation method annotated with @Execute can return only Promise or void: "
                                    + getMethodFullName(method));
                }
                if (!method.getDeclaringClass().equals(interfaze)) {
                    throw new IllegalArgumentException("Interface " + interfaze.getName()
                            + " cannot inherit workflow implementation method annotated with @Execute: "
                            + getMethodFullName(method));

                }
                DataConverter converter = createConverter(workflowAnnotation.dataConverter(), converterOverride);
                workflowImplementationMethod = new MethodConverterPair(method, converter);
                workflowType = getWorkflowType(interfaceName, method, executeAnnotation);
                
                WorkflowRegistrationOptions registrationOptionsAnnotation = interfaze.getAnnotation(WorkflowRegistrationOptions.class);
                SkipTypeRegistration skipRegistrationAnnotation = interfaze.getAnnotation(SkipTypeRegistration.class);
                if (skipRegistrationAnnotation == null) {
                    if (registrationOptionsAnnotation == null) {
                        throw new IllegalArgumentException(
                                "@WorkflowRegistrationOptions is required for the interface that contains method annotated with @Execute");
                    }
                    registrationOptions = createRegistrationOptions(registrationOptionsAnnotation);
                }
                else {
                    if (registrationOptionsAnnotation != null) {
                        throw new IllegalArgumentException(
                                "@WorkflowRegistrationOptions is not allowed for the interface annotated with @SkipTypeRegistration.");
                    }
                }
            }
            if (signalAnnotation != null) {
                String signalName = signalAnnotation.name();
                if (signalName == null || signalName.isEmpty()) {
                    signalName = method.getName();
                }
                DataConverter signalConverter = createConverter(workflowAnnotation.dataConverter(), converterOverride);
                signals.put(signalName, new MethodConverterPair(method, signalConverter));
            }
            if (getStateAnnotation != null) {
                if (getStateMethod != null) {
                    throw new IllegalArgumentException(
                            "Interface annotated with @Workflow is allowed to have only one method annotated with @GetState. Found "
                                    + getMethodFullName(getStateMethod.getMethod()) + " and " + getMethodFullName(method));
                }
                if (method.getReturnType().equals(void.class) || (Promise.class.isAssignableFrom(method.getReturnType()))) {
                    throw new IllegalArgumentException(
                            "Workflow method annotated with @GetState cannot have void or Promise return type: "
                                    + getMethodFullName(method));
                }
                DataConverter converter = createConverter(workflowAnnotation.dataConverter(), converterOverride);
                getStateMethod = new MethodConverterPair(method, converter);
            }
        }
        if (workflowImplementationMethod == null) {
            throw new IllegalArgumentException("Workflow definition does not implement any method annotated with @Execute. "
                    + workflowImplementationType);
        }
        POJOWorkflowImplementationFactory implementationFactory = getImplementationFactory(workflowImplementationType, interfaze,
                workflowType);
        WorkflowDefinitionFactory factory = new POJOWorkflowDefinitionFactory(implementationFactory, workflowType,
                registrationOptions, workflowImplementationMethod, signals, getStateMethod);
        factories.put(workflowType, factory);
        workflowImplementationTypes.add(workflowImplementationType);
        if (factory.getWorkflowRegistrationOptions() != null) {
            workflowTypesToRegister.add(workflowType);
        }
    }

    private void checkAnnotationUniqueness(Method method, Object... annotations) {
        List<Object> notNullOnes = new ArrayList<Object>();
        for (Object annotation : annotations) {
            if (annotation != null) {
                notNullOnes.add(annotation);
            }
        }
        if (notNullOnes.size() > 1) {
            throw new IllegalArgumentException("Method " + method.getName() + " is annotated with both " + notNullOnes);
        }
    }

    /**
     * Override to control how implementation is instantiated.
     * 
     * @param workflowImplementationType
     *            type that was registered with the factory
     * @param workflowInteface
     *            interface that defines external workflow contract
     * @param workflowType
     *            type of the workflow that implementation implements
     * @return factory that creates new instances of the POJO that implements
     *         workflow
     */
    protected POJOWorkflowImplementationFactory getImplementationFactory(final Class<?> workflowImplementationType,
            Class<?> workflowInteface, WorkflowType workflowType) {
        return new POJOWorkflowImplementationFactory() {

            @Override
            public Object newInstance(DecisionContext decisionContext) throws Exception {
                return workflowImplementationType.newInstance();
            }

            @Override
            public void deleteInstance(Object instance) {
            }
        };
    }

    /**
     * Recursively find all interfaces annotated with @Workflow that given class
     * implements. Don not include interfaces that @Workflow annotated interface
     * extends.
     */
    private void getImplementedInterfacesAnnotatedWithWorkflow(Class<?> workflowImplementationType,
            Set<Class<?>> implementedInterfaces) {
        Class<?> superClass = workflowImplementationType.getSuperclass();
        if (superClass != null) {
            getImplementedInterfacesAnnotatedWithWorkflow(superClass, implementedInterfaces);
        }
        
        Class<?>[] interfaces = workflowImplementationType.getInterfaces();
        for (Class<?> i : interfaces) {
            if (i.getAnnotation(Workflow.class) != null && !implementedInterfaces.contains(i)) {
                boolean skipAdd = removeSuperInterfaces(i, implementedInterfaces);
                if (!skipAdd) {
                    implementedInterfaces.add(i);
                }
            }
            else {
                getImplementedInterfacesAnnotatedWithWorkflow(i, implementedInterfaces);
            }
        }
    }
    
    private boolean removeSuperInterfaces(Class<?> interfaceToAdd, Set<Class<?>> implementedInterfaces) {
        boolean skipAdd = false;
        List<Class<?>> interfacesToRemove = new ArrayList<Class<?>>();
        for (Class<?> addedInterface : implementedInterfaces) {
            if (addedInterface.isAssignableFrom(interfaceToAdd)) {
                interfacesToRemove.add(addedInterface);
            }
            if (interfaceToAdd.isAssignableFrom(addedInterface)) {
                skipAdd = true;
            }
        }
        
        for (Class<?> interfaceToRemove : interfacesToRemove) {
            implementedInterfaces.remove(interfaceToRemove);
        }
        
        return skipAdd;
    }

    private static String getMethodFullName(Method m) {
        return m.getDeclaringClass().getName() + "." + m.getName();
    }

    private DataConverter createConverter(Class<? extends DataConverter> converterTypeFromAnnotation,
            DataConverter converterOverride) throws InstantiationException, IllegalAccessException {
        if (converterOverride != null) {
            return converterOverride;
        }
        if (converterTypeFromAnnotation == null || converterTypeFromAnnotation.equals(NullDataConverter.class)) {
            return converter;
        }
        return converterTypeFromAnnotation.newInstance();
    }

    protected WorkflowType getWorkflowType(String interfaceName, Method method, Execute executeAnnotation) {
        assert (method != null);
        assert (executeAnnotation != null);

        WorkflowType workflowType = new WorkflowType();

        String workflowName = null;
        if (executeAnnotation.name() != null && !executeAnnotation.name().isEmpty()) {
            workflowName = executeAnnotation.name();
        }
        else {
            workflowName = interfaceName + "." + method.getName();
        }

        if (executeAnnotation.version().isEmpty()) {
            throw new IllegalArgumentException(
                    "Empty value of the required \"version\" parameter of the @Execute annotation found on "
                            + getMethodFullName(method));
        }
        workflowType.setName(workflowName);
        workflowType.setVersion(executeAnnotation.version());
        return workflowType;
    }

    protected WorkflowTypeRegistrationOptions createRegistrationOptions(WorkflowRegistrationOptions registrationOptionsAnnotation) {

        WorkflowTypeRegistrationOptions result = new WorkflowTypeRegistrationOptions();

        result.setDescription(emptyStringToNull(registrationOptionsAnnotation.description()));
        result.setDefaultExecutionStartToCloseTimeoutSeconds(registrationOptionsAnnotation.defaultExecutionStartToCloseTimeoutSeconds());
        result.setDefaultTaskStartToCloseTimeoutSeconds(registrationOptionsAnnotation.defaultTaskStartToCloseTimeoutSeconds());

        String taskList = registrationOptionsAnnotation.defaultTaskList();
        if (!taskList.equals(FlowConstants.USE_WORKER_TASK_LIST)) {
            result.setDefaultTaskList(taskList);
        }
        result.setDefaultChildPolicy(registrationOptionsAnnotation.defaultChildPolicy());
        return result;
    }

    private static String emptyStringToNull(String value) {
        if (value.length() == 0) {
            return null;
        }
        return value;
    }
}
