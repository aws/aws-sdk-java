package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.flow.core.Functor;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;
import com.amazonaws.services.simpleworkflow.flow.generic.ExecuteActivityParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class DynamicActivitiesClientImpl implements DynamicActivitiesClient {

    protected DataConverter dataConverter;

    protected ActivitySchedulingOptions schedulingOptions;

    protected GenericActivityClient genericClient;

    protected DecisionContextProvider decisionContextProvider = new DecisionContextProviderImpl();

    public DynamicActivitiesClientImpl() {
        this(null, null, null);
    }

    public DynamicActivitiesClientImpl(ActivitySchedulingOptions schedulingOptions) {
        this(schedulingOptions, null, null);
    }

    public DynamicActivitiesClientImpl(ActivitySchedulingOptions schedulingOptions, DataConverter dataConverter) {
        this(schedulingOptions, dataConverter, null);
    }

    public DynamicActivitiesClientImpl(ActivitySchedulingOptions schedulingOptions, DataConverter dataConverter,
            GenericActivityClient genericClient) {
        this.genericClient = genericClient;

        if (schedulingOptions == null) {
            this.schedulingOptions = new ActivitySchedulingOptions();
        }
        else {
            this.schedulingOptions = schedulingOptions;
        }

        if (dataConverter == null) {
            this.dataConverter = new JsonDataConverter();
        }
        else {
            this.dataConverter = dataConverter;
        }

    }

    @Override
    public DataConverter getDataConverter() {
        return dataConverter;
    }

    public void setDataConverter(DataConverter dataConverter) {
        this.dataConverter = dataConverter;
    }

    @Override
    public ActivitySchedulingOptions getSchedulingOptions() {
        return schedulingOptions;
    }

    public void setSchedulingOptions(ActivitySchedulingOptions schedulingOptions) {
        this.schedulingOptions = schedulingOptions;
    }

    @Override
    public GenericActivityClient getGenericClient() {
        return genericClient;
    }

    public void setGenericClient(GenericActivityClient genericClient) {
        this.genericClient = genericClient;
    }

    public <T> Promise<T> scheduleActivity(final ActivityType activityType, final Promise<?>[] arguments,
            final ActivitySchedulingOptions optionsOverride, final Class<T> returnType, final Promise<?>... waitFor) {
        return new Functor<T>(arguments) {

            @Override
            protected Promise<T> doExecute() throws Throwable {
                Object[] input = new Object[arguments.length];
                for (int i = 0; i < arguments.length; i++) {
                    Promise<?> argument = arguments[i];
                    input[i] = argument.get();
                }
                return scheduleActivity(activityType, input, optionsOverride, returnType, waitFor);
            }

        };

    }

    public <T> Promise<T> scheduleActivity(final ActivityType activityType, final Object[] arguments,
            final ActivitySchedulingOptions optionsOverride, final Class<T> returnType, Promise<?>... waitFor) {
        final Settable<T> result = new Settable<T>();
        new TryCatchFinally(waitFor) {

            Promise<String> stringOutput;

            @Override
            protected void doTry() throws Throwable {
                ExecuteActivityParameters parameters = new ExecuteActivityParameters();
                parameters.setActivityType(activityType);
                String stringInput = dataConverter.toData(arguments);
                parameters.setInput(stringInput);
                final ExecuteActivityParameters _scheduleParameters_ = parameters.createExecuteActivityParametersFromOptions(
                        schedulingOptions, optionsOverride);

                GenericActivityClient client;
                if (genericClient == null) {
                    client = decisionContextProvider.getDecisionContext().getActivityClient();
                } else {
                    client = genericClient;
                }
                stringOutput = client.scheduleActivityTask(_scheduleParameters_);
                result.setDescription(stringOutput.getDescription());
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                if (e instanceof ActivityTaskFailedException) {
                    ActivityTaskFailedException taskFailedException = (ActivityTaskFailedException) e;
                    try {
                        String details = taskFailedException.getDetails();
                        if (details != null) {
                            Throwable cause = dataConverter.fromData(details, Throwable.class);
                            if (cause != null && taskFailedException.getCause() == null) {
                                taskFailedException.initCause(cause);
                            }
                        }
                    }
                    catch (DataConverterException dataConverterException) {
                        if (dataConverterException.getCause() == null) {
                            dataConverterException.initCause(taskFailedException);
                        }
                        throw dataConverterException;
                    }
                }

                throw e;
            }

            @Override
            protected void doFinally() throws Throwable {
                if (stringOutput != null && stringOutput.isReady()) {
                    if (returnType.equals(Void.class)) {
                        result.set(null);
                    }
                    else {
                        T output = dataConverter.fromData(stringOutput.get(), returnType);
                        result.set(output);
                    }
                }
            }
        };
        return result;
    }

}
