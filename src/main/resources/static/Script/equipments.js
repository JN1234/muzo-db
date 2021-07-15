
$('document').ready(function(){

    $('table editButton').on('click',function(event){
    
    event.preventDefault();
    
    // /equipments/findById/?id=1
    
    var href=$(this).attr('href');
    
    $.get(href, function(equipment, status){
    $('IdEdit').val(equipment.id);
    $('descriptionEdit').val(equipment.description);
    $('equipEdit').val(equipment.name);
    });
    $('updateModal').modal();
    });


    $('table deleteButton').on('click', function(event){
        event.preventDefault();

        var href= $(this).attr('href');
        $('confirmDelete').attr('href', href)
        $('deleteModal').modal();

    });

    });

   /* $('document').ready(function(){
        $('table #editButton').on('click',function(event){
    
            //event.preventDefault();
            $('#updateModal').modal();
    });
});*/