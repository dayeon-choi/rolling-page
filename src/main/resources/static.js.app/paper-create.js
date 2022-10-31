var paperCreate = {
    init: function() {
        var _this = this;

        $('#paper-create__input').on('keyup', function(e) {
            if(e.keyCode==13){
                _this.createPaper($(this).val());
            }
        });

        $('#paper-create__btn').on('click', function() {
            _this.createPaper($('#paper-create__input').val());
        });
    },

    createPaper: function(path) {
        window.location.href = '/' + path;
        // TODO: create api
    },
};

paperCreate.init();
