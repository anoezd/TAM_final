var
    mySelector, mySelector1;

function updateFilters() {
    $('.task-list-row').hide().filter(function() {
        var
            self = $(this),
            result = true; // not guilty until proven guilty

        if (mySelector && (mySelector != 'All')) {
            result = result && mySelector === self.data('assigned-user');
        }
        if (mySelector1 && (mySelector1 != 'All')) {
            result = result && mySelector1 === self.data('status');
        }


        return result;
    }).show();
}

// Assigned User Dropdown Filter
$('#mySelector').on('change', function() {
    mySelector = this.value;
    updateFilters();
});

// Task Status Dropdown Filter
$('#mySelector1').on('change', function() {
    mySelector1 = this.value;
    updateFilters();
});

