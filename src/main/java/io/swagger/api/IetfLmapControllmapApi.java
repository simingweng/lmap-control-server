package io.swagger.api;

import io.swagger.model.Action;
import io.swagger.model.Action1;
import io.swagger.model.Agent;
import io.swagger.model.Agent1;
import io.swagger.model.Event;
import io.swagger.model.Event1;
import io.swagger.model.Events;
import io.swagger.model.Events1;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse200EventsEvent;
import io.swagger.model.InlineResponse200SchedulesAction;
import io.swagger.model.InlineResponse200SchedulesParameters;
import io.swagger.model.InlineResponse200SchedulesSchedule;
import io.swagger.model.InlineResponse200SuppressionsSuppression;
import io.swagger.model.InlineResponse200TasksMetric;
import io.swagger.model.InlineResponse200TasksOption;
import io.swagger.model.InlineResponse200TasksTask;
import java.util.List;
import io.swagger.model.Lmap;
import io.swagger.model.Lmap1;
import io.swagger.model.Metric;
import io.swagger.model.Metric1;
import io.swagger.model.Option;
import io.swagger.model.Option1;
import io.swagger.model.Option2;
import io.swagger.model.Option3;
import io.swagger.model.Parameters;
import io.swagger.model.Parameters1;
import io.swagger.model.Schedule;
import io.swagger.model.Schedule1;
import io.swagger.model.Schedules;
import io.swagger.model.Schedules1;
import io.swagger.model.Suppression;
import io.swagger.model.Suppression1;
import io.swagger.model.Suppressions;
import io.swagger.model.Suppressions1;
import io.swagger.model.Task;
import io.swagger.model.Task1;
import io.swagger.model.Tasks;
import io.swagger.model.Tasks1;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

@Api(value = "ietf-lmap-control:lmap", description = "the ietf-lmap-control:lmap API")
public interface IetfLmapControllmapApi {

    @ApiOperation(value = "Delete agent from lmap", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/agent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapAgentDelete();


    @ApiOperation(value = "View detail on agent", notes = "Configuration of parameters affecting the whole measurement agent.", response = InlineResponse2001.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of agent", response = InlineResponse2001.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/agent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> ietfLmapControllmapAgentGet();


    @ApiOperation(value = "Merge details on agent", notes = "", response = InlineResponse2001.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of agent", response = InlineResponse2001.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/agent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2001> ietfLmapControllmapAgentPatch(@ApiParam(value = "Configuration of parameters affecting the whole measurement agent."  ) @RequestBody Agent1 agent);


    @ApiOperation(value = "Update details on agent", notes = "", response = InlineResponse2001.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of agent", response = InlineResponse2001.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/agent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2001> ietfLmapControllmapAgentPut(@ApiParam(value = "Configuration of parameters affecting the whole measurement agent."  ) @RequestBody Agent agent);


    @ApiOperation(value = "Delete lmap from ietf-lmap-control", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapDelete();


    @ApiOperation(value = "Delete events from lmap", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapEventsDelete();


    @ApiOperation(value = "List all events from events", notes = "", response = InlineResponse200EventsEvent.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of events", response = InlineResponse200EventsEvent.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events/event",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200EventsEvent>> ietfLmapControllmapEventsEventGet();


    @ApiOperation(value = "Delete event from events", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events/event/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapEventsEventNameDelete(@ApiParam(value = "The unique name of an event source.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "View detail on event", notes = "The list of event sources configured on the LMAP agent.", response = InlineResponse200EventsEvent.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of event", response = InlineResponse200EventsEvent.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events/event/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200EventsEvent> ietfLmapControllmapEventsEventNameGet(@ApiParam(value = "The unique name of an event source.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Merge details on event", notes = "", response = InlineResponse200EventsEvent.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of event", response = InlineResponse200EventsEvent.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events/event/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse200EventsEvent> ietfLmapControllmapEventsEventNamePatch(@ApiParam(value = "The unique name of an event source.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody Event1 event);


    @ApiOperation(value = "Update details on event", notes = "", response = InlineResponse200EventsEvent.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of event", response = InlineResponse200EventsEvent.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events/event/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse200EventsEvent> ietfLmapControllmapEventsEventNamePut(@ApiParam(value = "The unique name of an event source.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody Event event);


    @ApiOperation(value = "Merge items into the event collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events/event",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapEventsEventPatch(@ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody List<InlineResponse200EventsEvent> event);


    @ApiOperation(value = "Creates one or more new event in events", notes = "The list of event sources configured on the LMAP agent.", response = InlineResponse200EventsEvent.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating event(s) in collection", response = InlineResponse200EventsEvent.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events/event",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200EventsEvent>> ietfLmapControllmapEventsEventPost(@ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody List<InlineResponse200EventsEvent> event);


    @ApiOperation(value = "Replace the entire event collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events/event",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapEventsEventPut(@ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody List<InlineResponse200EventsEvent> event);


    @ApiOperation(value = "View detail on events", notes = "Configuration of LMAP events.  Implementations may be forced to delay acting upon the occurance of events in the face of local constraints. An action triggered by an event therefore should not rely on the accuracy provided by the scheduler implementation.", response = InlineResponse2008.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of events", response = InlineResponse2008.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2008> ietfLmapControllmapEventsGet();


    @ApiOperation(value = "Merge details on events", notes = "", response = InlineResponse2008.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of events", response = InlineResponse2008.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2008> ietfLmapControllmapEventsPatch(@ApiParam(value = "Configuration of LMAP events.  Implementations may be forced to delay acting upon the occurance of events in the face of local constraints. An action triggered by an event therefore should not rely on the accuracy provided by the scheduler implementation."  ) @RequestBody Events1 events);


    @ApiOperation(value = "Update details on events", notes = "", response = InlineResponse2008.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of events", response = InlineResponse2008.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/events",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2008> ietfLmapControllmapEventsPut(@ApiParam(value = "Configuration of LMAP events.  Implementations may be forced to delay acting upon the occurance of events in the face of local constraints. An action triggered by an event therefore should not rely on the accuracy provided by the scheduler implementation."  ) @RequestBody Events events);


    @ApiOperation(value = "View detail on lmap", notes = "Configuration of the LMAP agent.", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of lmap", response = InlineResponse200.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> ietfLmapControllmapGet();


    @ApiOperation(value = "Merge details on lmap", notes = "", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of lmap", response = InlineResponse200.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse200> ietfLmapControllmapPatch(@ApiParam(value = "Configuration of the LMAP agent."  ) @RequestBody Lmap1 lmap);


    @ApiOperation(value = "Update details on lmap", notes = "", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of lmap", response = InlineResponse200.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse200> ietfLmapControllmapPut(@ApiParam(value = "Configuration of the LMAP agent."  ) @RequestBody Lmap lmap);


    @ApiOperation(value = "Delete schedules from lmap", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapSchedulesDelete();


    @ApiOperation(value = "View detail on schedules", notes = "Configuration of LMAP schedules. Schedules control which tasks are executed by the LMAP implementation.", response = InlineResponse2005.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedules", response = InlineResponse2005.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2005> ietfLmapControllmapSchedulesGet();


    @ApiOperation(value = "Merge details on schedules", notes = "", response = InlineResponse2005.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedules", response = InlineResponse2005.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2005> ietfLmapControllmapSchedulesPatch(@ApiParam(value = "Configuration of LMAP schedules. Schedules control which tasks are executed by the LMAP implementation."  ) @RequestBody Schedules1 schedules);


    @ApiOperation(value = "Update details on schedules", notes = "", response = InlineResponse2005.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedules", response = InlineResponse2005.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2005> ietfLmapControllmapSchedulesPut(@ApiParam(value = "Configuration of LMAP schedules. Schedules control which tasks are executed by the LMAP implementation."  ) @RequestBody Schedules schedules);


    @ApiOperation(value = "List all schedules from schedules", notes = "", response = InlineResponse200SchedulesSchedule.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedules", response = InlineResponse200SchedulesSchedule.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200SchedulesSchedule>> ietfLmapControllmapSchedulesScheduleGet();


    @ApiOperation(value = "Merge items into the schedule collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapSchedulesSchedulePatch(@ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody List<InlineResponse200SchedulesSchedule> schedule);


    @ApiOperation(value = "Creates one or more new schedule in schedules", notes = "Configuration of a particular schedule.", response = InlineResponse200SchedulesSchedule.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating schedule(s) in collection", response = InlineResponse200SchedulesSchedule.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200SchedulesSchedule>> ietfLmapControllmapSchedulesSchedulePost(@ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody List<InlineResponse200SchedulesSchedule> schedule);


    @ApiOperation(value = "Replace the entire schedule collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapSchedulesSchedulePut(@ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody List<InlineResponse200SchedulesSchedule> schedule);


    @ApiOperation(value = "List all actions from schedule", notes = "", response = InlineResponse200SchedulesAction.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of actions", response = InlineResponse200SchedulesAction.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200SchedulesAction>> ietfLmapControllmapSchedulesScheduleScheduleNameActionGet(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "Delete action from schedule", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameDelete(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "View detail on action", notes = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially.", response = InlineResponse200SchedulesAction.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of action", response = InlineResponse200SchedulesAction.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200SchedulesAction> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameGet(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "List all options from task-options-grouping", notes = "", response = InlineResponse200TasksOption.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of options", response = InlineResponse200TasksOption.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/option",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200TasksOption>> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionGet(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "Delete option from task-options-grouping", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/option/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionIdDelete(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "View detail on option", notes = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task.", response = InlineResponse2004.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of option", response = InlineResponse2004.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/option/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2004> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionIdGet(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "Merge details on option", notes = "", response = InlineResponse2004.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of option", response = InlineResponse2004.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/option/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2004> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionIdPatch(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody Option3 option);


    @ApiOperation(value = "Update details on option", notes = "", response = InlineResponse2004.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of option", response = InlineResponse2004.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/option/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2004> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionIdPut(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody Option2 option);


    @ApiOperation(value = "Merge items into the option collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/option",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionPatch(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option);


    @ApiOperation(value = "Creates one or more new option in task-options-grouping", notes = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task.", response = InlineResponse200TasksOption.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating option(s) in collection", response = InlineResponse200TasksOption.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/option",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200TasksOption>> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionPost(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option);


    @ApiOperation(value = "Replace the entire option collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/option",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionPut(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option);


    @ApiOperation(value = "Delete parameters from action", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/parameters",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameParametersDelete(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "View detail on parameters", notes = "This container is a place-holder for run-time parameters defined in task-specific or metric-specific data models augmenting the base lmap control data model.", response = InlineResponse200SchedulesParameters.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of parameters", response = InlineResponse200SchedulesParameters.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/parameters",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200SchedulesParameters> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameParametersGet(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "Merge details on parameters", notes = "", response = Parameters1.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of parameters", response = Parameters1.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/parameters",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Parameters1> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameParametersPatch(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "This container is a place-holder for run-time parameters defined in task-specific or metric-specific data models augmenting the base lmap control data model."  ) @RequestBody Parameters1 parameters);


    @ApiOperation(value = "Update details on parameters", notes = "", response = Parameters.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of parameters", response = Parameters.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}/parameters",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Parameters> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameParametersPut(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "This container is a place-holder for run-time parameters defined in task-specific or metric-specific data models augmenting the base lmap control data model."  ) @RequestBody Parameters parameters);


    @ApiOperation(value = "Merge details on action", notes = "", response = InlineResponse200SchedulesAction.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of action", response = InlineResponse200SchedulesAction.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse200SchedulesAction> ietfLmapControllmapSchedulesScheduleScheduleNameActionNamePatch(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody Action1 action);


    @ApiOperation(value = "Update details on action", notes = "", response = InlineResponse200SchedulesAction.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of action", response = InlineResponse200SchedulesAction.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse200SchedulesAction> ietfLmapControllmapSchedulesScheduleScheduleNameActionNamePut(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody Action action);


    @ApiOperation(value = "Merge items into the action collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionPatch(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody List<InlineResponse200SchedulesAction> action);


    @ApiOperation(value = "Creates one or more new action in schedule", notes = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially.", response = InlineResponse200SchedulesAction.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating action(s) in collection", response = InlineResponse200SchedulesAction.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200SchedulesAction>> ietfLmapControllmapSchedulesScheduleScheduleNameActionPost(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody List<InlineResponse200SchedulesAction> action);


    @ApiOperation(value = "Replace the entire action collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}/action",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionPut(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody List<InlineResponse200SchedulesAction> action);


    @ApiOperation(value = "Delete schedule from schedules", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameDelete(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "View detail on schedule", notes = "Configuration of a particular schedule.", response = InlineResponse200SchedulesSchedule.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedule", response = InlineResponse200SchedulesSchedule.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200SchedulesSchedule> ietfLmapControllmapSchedulesScheduleScheduleNameGet(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "Merge details on schedule", notes = "", response = InlineResponse200SchedulesSchedule.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedule", response = InlineResponse200SchedulesSchedule.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse200SchedulesSchedule> ietfLmapControllmapSchedulesScheduleScheduleNamePatch(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody Schedule1 schedule);


    @ApiOperation(value = "Update details on schedule", notes = "", response = InlineResponse200SchedulesSchedule.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedule", response = InlineResponse200SchedulesSchedule.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/schedules/schedule/{schedule-name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse200SchedulesSchedule> ietfLmapControllmapSchedulesScheduleScheduleNamePut(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody Schedule schedule);


    @ApiOperation(value = "Delete suppressions from lmap", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapSuppressionsDelete();


    @ApiOperation(value = "View detail on suppressions", notes = "Suppression information to prevent schedules or certain actions from starting.", response = InlineResponse2006.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppressions", response = InlineResponse2006.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2006> ietfLmapControllmapSuppressionsGet();


    @ApiOperation(value = "Merge details on suppressions", notes = "", response = InlineResponse2006.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppressions", response = InlineResponse2006.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2006> ietfLmapControllmapSuppressionsPatch(@ApiParam(value = "Suppression information to prevent schedules or certain actions from starting."  ) @RequestBody Suppressions1 suppressions);


    @ApiOperation(value = "Update details on suppressions", notes = "", response = InlineResponse2006.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppressions", response = InlineResponse2006.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2006> ietfLmapControllmapSuppressionsPut(@ApiParam(value = "Suppression information to prevent schedules or certain actions from starting."  ) @RequestBody Suppressions suppressions);


    @ApiOperation(value = "List all suppressions from suppressions", notes = "", response = InlineResponse200SuppressionsSuppression.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppressions", response = InlineResponse200SuppressionsSuppression.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions/suppression",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200SuppressionsSuppression>> ietfLmapControllmapSuppressionsSuppressionGet();


    @ApiOperation(value = "Delete suppression from suppressions", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions/suppression/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapSuppressionsSuppressionNameDelete(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "View detail on suppression", notes = "Configuration of a particular suppression.", response = InlineResponse2007.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppression", response = InlineResponse2007.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions/suppression/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2007> ietfLmapControllmapSuppressionsSuppressionNameGet(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Merge details on suppression", notes = "", response = InlineResponse2007.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppression", response = InlineResponse2007.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions/suppression/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2007> ietfLmapControllmapSuppressionsSuppressionNamePatch(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody Suppression1 suppression);


    @ApiOperation(value = "Update details on suppression", notes = "", response = InlineResponse2007.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppression", response = InlineResponse2007.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions/suppression/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2007> ietfLmapControllmapSuppressionsSuppressionNamePut(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody Suppression suppression);


    @ApiOperation(value = "Merge items into the suppression collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions/suppression",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapSuppressionsSuppressionPatch(@ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody List<InlineResponse200SuppressionsSuppression> suppression);


    @ApiOperation(value = "Creates one or more new suppression in suppressions", notes = "Configuration of a particular suppression.", response = InlineResponse200SuppressionsSuppression.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating suppression(s) in collection", response = InlineResponse200SuppressionsSuppression.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions/suppression",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200SuppressionsSuppression>> ietfLmapControllmapSuppressionsSuppressionPost(@ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody List<InlineResponse200SuppressionsSuppression> suppression);


    @ApiOperation(value = "Replace the entire suppression collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/suppressions/suppression",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapSuppressionsSuppressionPut(@ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody List<InlineResponse200SuppressionsSuppression> suppression);


    @ApiOperation(value = "Delete tasks from lmap", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapTasksDelete();


    @ApiOperation(value = "View detail on tasks", notes = "Configuration of LMAP tasks.", response = InlineResponse2002.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of tasks", response = InlineResponse2002.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2002> ietfLmapControllmapTasksGet();


    @ApiOperation(value = "Merge details on tasks", notes = "", response = InlineResponse2002.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of tasks", response = InlineResponse2002.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2002> ietfLmapControllmapTasksPatch(@ApiParam(value = "Configuration of LMAP tasks."  ) @RequestBody Tasks1 tasks);


    @ApiOperation(value = "Update details on tasks", notes = "", response = InlineResponse2002.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of tasks", response = InlineResponse2002.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2002> ietfLmapControllmapTasksPut(@ApiParam(value = "Configuration of LMAP tasks."  ) @RequestBody Tasks tasks);


    @ApiOperation(value = "List all tasks from tasks", notes = "", response = InlineResponse200TasksTask.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of tasks", response = InlineResponse200TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200TasksTask>> ietfLmapControllmapTasksTaskGet();


    @ApiOperation(value = "Delete task from tasks", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskNameDelete(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "View detail on task", notes = "The list of tasks configured on the LMAP agent.", response = InlineResponse200TasksTask.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of task", response = InlineResponse200TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200TasksTask> ietfLmapControllmapTasksTaskNameGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "List all metrics from metrics-grouping", notes = "", response = InlineResponse200TasksMetric.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of metrics", response = InlineResponse200TasksMetric.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/metric",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200TasksMetric>> ietfLmapControllmapTasksTaskNameMetricGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Merge items into the metric collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/metric",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskNameMetricPatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric);


    @ApiOperation(value = "Creates one or more new metric in metrics-grouping", notes = "A list of entries in a metrics registry.", response = InlineResponse200TasksMetric.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating metric(s) in collection", response = InlineResponse200TasksMetric.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/metric",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200TasksMetric>> ietfLmapControllmapTasksTaskNameMetricPost(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric);


    @ApiOperation(value = "Replace the entire metric collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/metric",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskNameMetricPut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric);


    @ApiOperation(value = "Delete metric from metrics-grouping", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/metric/{uri}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskNameMetricUriDelete(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "View detail on metric", notes = "A list of entries in a metrics registry.", response = InlineResponse2003.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of metric", response = InlineResponse2003.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/metric/{uri}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2003> ietfLmapControllmapTasksTaskNameMetricUriGet(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Merge details on metric", notes = "", response = InlineResponse2003.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of metric", response = InlineResponse2003.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/metric/{uri}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2003> ietfLmapControllmapTasksTaskNameMetricUriPatch(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody Metric1 metric);


    @ApiOperation(value = "Update details on metric", notes = "", response = InlineResponse2003.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of metric", response = InlineResponse2003.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/metric/{uri}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2003> ietfLmapControllmapTasksTaskNameMetricUriPut(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody Metric metric);


    @ApiOperation(value = "List all options from task-options-grouping", notes = "", response = InlineResponse200TasksOption.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of options", response = InlineResponse200TasksOption.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/option",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200TasksOption>> ietfLmapControllmapTasksTaskNameOptionGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Delete option from task-options-grouping", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/option/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskNameOptionIdDelete(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "View detail on option", notes = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task.", response = InlineResponse2004.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of option", response = InlineResponse2004.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/option/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2004> ietfLmapControllmapTasksTaskNameOptionIdGet(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Merge details on option", notes = "", response = InlineResponse2004.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of option", response = InlineResponse2004.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/option/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2004> ietfLmapControllmapTasksTaskNameOptionIdPatch(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody Option1 option);


    @ApiOperation(value = "Update details on option", notes = "", response = InlineResponse2004.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of option", response = InlineResponse2004.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/option/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2004> ietfLmapControllmapTasksTaskNameOptionIdPut(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody Option option);


    @ApiOperation(value = "Merge items into the option collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/option",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskNameOptionPatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option);


    @ApiOperation(value = "Creates one or more new option in task-options-grouping", notes = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task.", response = InlineResponse200TasksOption.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating option(s) in collection", response = InlineResponse200TasksOption.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/option",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200TasksOption>> ietfLmapControllmapTasksTaskNameOptionPost(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option);


    @ApiOperation(value = "Replace the entire option collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}/option",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskNameOptionPut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option);


    @ApiOperation(value = "Merge details on task", notes = "", response = InlineResponse200TasksTask.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of task", response = InlineResponse200TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse200TasksTask> ietfLmapControllmapTasksTaskNamePatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody Task1 task);


    @ApiOperation(value = "Update details on task", notes = "", response = InlineResponse200TasksTask.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of task", response = InlineResponse200TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse200TasksTask> ietfLmapControllmapTasksTaskNamePut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody Task task);


    @ApiOperation(value = "Merge items into the task collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskPatch(@ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody List<InlineResponse200TasksTask> task);


    @ApiOperation(value = "Creates one or more new task in tasks", notes = "The list of tasks configured on the LMAP agent.", response = InlineResponse200TasksTask.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating task(s) in collection", response = InlineResponse200TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200TasksTask>> ietfLmapControllmapTasksTaskPost(@ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody List<InlineResponse200TasksTask> task);


    @ApiOperation(value = "Replace the entire task collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap/tasks/task",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapTasksTaskPut(@ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody List<InlineResponse200TasksTask> task);

}
